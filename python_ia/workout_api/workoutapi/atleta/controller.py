from fastapi import APIRouter, status, Body, HTTPException, Query
from atleta.schemas import AtletaIn, AtletaOut, AtletaUpdate, AtletaRestrito
from atleta.models import AtletaModel
from sqlalchemy.future import select
from datetime import datetime
from uuid import uuid4, UUID
from categorias.models import CategoriaModel
from sqlalchemy.orm import joinedload
from typing import List, Optional
from centro_treinamento.models import CentroTreinamentoModel
from contrib.dependencies import DataBaseDependency
from fastapi_pagination import paginate, Page

router = APIRouter()

@router.post(
        '/', 
        summary='Criar novo atleta',
        status_code=status.HTTP_201_CREATED,
        response_model=AtletaOut
)
async def post(
    db_session: DataBaseDependency, 
    atleta_in: AtletaIn = Body(...)
):
    existing_atleta = (await db_session.execute(
        select(AtletaModel).filter_by(cpf=atleta_in.cpf)
    )).scalar()

    if existing_atleta:
        raise HTTPException(
            status_code=status.HTTP_303_SEE_OTHER,
            detail=f"Já existe um atleta cadastrado com o CPF {atleta_in.cpf}"
        )
    
    categoria_nome = atleta_in.categoria.nome

    categoria = (await db_session.execute(select(CategoriaModel).filter_by(nome=atleta_in.categoria.nome))).scalars().first()

    if not categoria:
        raise HTTPException(
            status_code=status.HTTP_400_BAD_REQUEST,
            detail=f"A categoria {categoria_nome} não foi encontrada."
    )

    centro_treinamento_nome = atleta_in.centro_treinamento.nome

    centro_treinamento = (await db_session.execute(select(CentroTreinamentoModel).filter_by(nome=centro_treinamento_nome))).scalars().first()
    
    if not centro_treinamento:
        raise HTTPException(
            status_code=status.HTTP_400_BAD_REQUEST,
            detail=f"O centro de treinamento {centro_treinamento_nome} não foi encontrada."
    )

    try:

        atleta_out = AtletaOut(id=uuid4(), created_at=datetime.now(), **atleta_in.model_dump())
        atleta_model = AtletaModel(**atleta_out.model_dump(exclude={'categoria', 'centro_treinamento'}))
        
        atleta_model.categoria_id = categoria.pk_id
        atleta_model.centro_treinamento_id = centro_treinamento.pk_id

        db_session.add(atleta_model)
        await db_session.commit()
    except Exception:
        raise HTTPException(
            status_code=status.HTTP_500_INTERNAL_SERVER_ERROR,
            detail='Ocorreu um erro ao inserir no banco.'
        )

    return atleta_out

@router.get(
    '/', 
    summary='Consultar todos os atletas',
    status_code=status.HTTP_200_OK,
    response_model=Page[AtletaRestrito]  # List ao invés de list()
)
async def query_all(
    db_session: DataBaseDependency,
    nome: Optional[str] = Query(None, description='Filtrar por nome do atleta'),
    cpf: Optional[str] = Query(None, description='Filtrar por CPF do atleta'),
) -> Page[AtletaRestrito]:  
    query = select(AtletaModel).options(joinedload(AtletaModel.categoria), joinedload(AtletaModel.centro_treinamento))

    if nome:
        query = query.filter(AtletaModel.nome.ilike(f'%{nome}%'))

    if cpf:
        query = query.filter(AtletaModel.cpf == cpf)

    result = await db_session.execute(query)
    atletas = result.scalars().all()

    return paginate(atletas)
    

@router.get(
    '/{id}', 
    summary='Consultar atleta por id',
    status_code=status.HTTP_200_OK,
    response_model=AtletaOut  # List ao invés de list()
)
async def query(
    id: UUID,
    db_session: DataBaseDependency
) -> AtletaOut:
    result = await db_session.execute(
        select(AtletaModel).options(joinedload(AtletaModel.categoria), joinedload(AtletaModel.centro_treinamento)).filter_by(id=id)
    )
    atleta = result.scalars().first()

    if not atleta:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND, detail=f"Atleta não encontrado no id {id}")

    return atleta

@router.patch(
    '/{id}', 
    summary='Editar atleta por id',
    status_code=status.HTTP_200_OK,
    response_model=AtletaOut  # List ao invés de list()
)
async def get(
    id: UUID,
    db_session: DataBaseDependency,
    atleta_up: AtletaUpdate = Body(...)
) -> AtletaOut:
    result = await db_session.execute(
        select(AtletaModel).options(joinedload(AtletaModel.categoria), joinedload(AtletaModel.centro_treinamento)).filter_by(id=id)
    )
    atleta = result.scalars().first()

    if not atleta:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND, detail=f"Atleta não encontrado no id {id}")
    
    atleta_update = atleta_up.model_dump(exclude_unset=True)
    for key, value in atleta_update.items():
        setattr(atleta, key, value)
    
    await db_session.commit()
    await db_session.refresh(atleta)

    return atleta

@router.delete(
    '/{id}', 
    summary='Deletar atleta por id',
    status_code=status.HTTP_204_NO_CONTENT,
)
async def query(
    id: UUID,
    db_session: DataBaseDependency
):
    result = await db_session.execute(
        select(AtletaModel).options(joinedload(AtletaModel.categoria), joinedload(AtletaModel.centro_treinamento)).filter_by(id=id)
    )
    atleta = result.scalars().first()

    if not atleta:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND, detail=f"Atleta não encontrado no id {id}")

    await db_session.delete(atleta)
    await db_session.commit()


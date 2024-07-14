from sqlalchemy.future import select
from uuid import uuid4, UUID
from typing import List
from fastapi import APIRouter, status, Body, HTTPException
from centro_treinamento.schemas import CentroTreinamentoIn, CentroTreinamentoOut
from contrib.dependencies import DataBaseDependency
from centro_treinamento.models import CentroTreinamentoModel

router = APIRouter()

@router.post(
    '/', 
    summary='Criar um novo centro de treinamento',
    status_code= status.HTTP_201_CREATED,
    response_model=CentroTreinamentoOut
)

async def post(
    db_session: DataBaseDependency, 
    categoria_in: CentroTreinamentoIn = Body(...)
) -> CentroTreinamentoOut:
    centro_treinamento_out = CentroTreinamentoOut(id=uuid4(), **categoria_in.model_dump())
    centro_treinamento_out_model = CentroTreinamentoModel(**centro_treinamento_out.model_dump())
    
    db_session.add(centro_treinamento_out_model)
    await db_session.commit()

    return centro_treinamento_out


@router.get(
    '/', 
    summary='Consultar todos os centros de treinamento',
    status_code=status.HTTP_200_OK,
    response_model=List[CentroTreinamentoOut]  # List ao invés de list()
)
async def query(
    db_session: DataBaseDependency
) -> List[CentroTreinamentoOut]:  
    centro_treinamento_out: List[CentroTreinamentoOut] = (await db_session.execute(select(CentroTreinamentoModel))).scalars().all()

    return centro_treinamento_out


@router.get(
    '/{id}', 
    summary='Consultar centro de treinamento por id',
    status_code=status.HTTP_200_OK,
    response_model=CentroTreinamentoOut  # List ao invés de list()
)
async def query(
    id: UUID,
    db_session: DataBaseDependency
) -> CentroTreinamentoOut:
    categoria: CentroTreinamentoOut = (await db_session.execute(select(CentroTreinamentoModel).filter_by(id=id))).scalars().first()

    if not categoria:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND, detail=f"Categoria não encontrada no id {id}")

    return categoria
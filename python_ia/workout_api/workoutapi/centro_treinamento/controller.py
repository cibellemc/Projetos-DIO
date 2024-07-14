from sqlalchemy.future import select
from uuid import uuid4, UUID
from typing import List
from fastapi import APIRouter, status, Body, HTTPException
from centro_treinamento.schemas import CentroTreinamentoIn
from contrib.dependencies import DataBaseDependency
from centro_treinamento.models import CentroTreinamentoModel

router = APIRouter()

@router.post(
    '/', 
    summary='Criar uma nova categoria',
    status_code= status.HTTP_201_CREATED,
    response_model=CategoriaOut
)

async def post(
    db_session: DataBaseDependency, 
    categoria_in: CategoriaIn = Body(...)
) -> CategoriaOut:
    categoria_out = CategoriaOut(id=uuid4(), **categoria_in.model_dump())
    categoria_model = CentroTreinamentoModel(**categoria_out.model_dump())
    
    db_session.add(categoria_model)
    await db_session.commit()

    return categoria_out


@router.get(
    '/', 
    summary='Consultar todas as centro_treinamento',
    status_code=status.HTTP_200_OK,
    response_model=List[CategoriaOut]  # List ao invés de list()
)
async def query(
    db_session: DataBaseDependency
) -> List[CategoriaOut]:  
    centro_treinamento: List[CategoriaOut] = (await db_session.execute(select(CentroTreinamentoModel))).scalars().all()

    return centro_treinamento


@router.get(
    '/{id}', 
    summary='Consultar categoria por id',
    status_code=status.HTTP_200_OK,
    response_model=CategoriaOut  # List ao invés de list()
)
async def query(
    id: UUID,
    db_session: DataBaseDependency
) -> CategoriaOut:
    categoria: CategoriaOut = (await db_session.execute(select(CentroTreinamentoModel).filter_by(id=id))).scalars().first()

    if not categoria:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND, detail=f"Categoria não encontrada no id {id}")

    return categoria
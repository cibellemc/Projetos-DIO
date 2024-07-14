from sqlalchemy.future import select
from uuid import uuid4, UUID
from typing import List
from fastapi import APIRouter, status, Body, HTTPException
from categorias.schemas import CategoriaIn, CategoriaOut
from contrib.dependencies import DataBaseDependency
from categorias.models import CategoriaModel

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
    categoria_model = CategoriaModel(**categoria_out.model_dump())
    
    db_session.add(categoria_model)
    await db_session.commit()

    return categoria_out


@router.get(
    '/', 
    summary='Consultar todas as categorias',
    status_code=status.HTTP_200_OK,
    response_model=List[CategoriaOut]  # List ao invés de list()
)
async def query(
    db_session: DataBaseDependency
) -> List[CategoriaOut]:  
    categorias: List[CategoriaOut] = (await db_session.execute(select(CategoriaModel))).scalars().all()

    return categorias


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
    categoria: CategoriaOut = (await db_session.execute(select(CategoriaModel).filter_by(id=id))).scalars().first()

    if not categoria:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND, detail=f"Categoria não encontrada no id {id}")

    return categoria
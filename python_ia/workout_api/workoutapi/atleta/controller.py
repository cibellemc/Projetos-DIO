from fastapi import APIRouter, status, Body
from atleta.schemas import AtletaIn
from contrib.dependencies import DataBaseDependency

router = APIRouter()

@router.post(
        '/', 
        summary='Criar novo atleta',
        status_code=status.HTTP_201_CREATED
)

async def post(
    db_session: DataBaseDependency, 
    atleta_in: AtletaIn = Body(...)
):
    pass 
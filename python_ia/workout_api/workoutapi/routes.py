from fastapi import APIRouter
from atleta.controller import router as atleta
from categorias.controller import router as categoria

api_router = APIRouter()
api_router.include_router(atleta, prefix='/atletas', tags=['atletas'])
api_router.include_router(categoria, prefix='/categorias', tags=['categorias'])
from sqlalchemy import Column, Integer, String
from sqlalchemy.orm import relationship
from contrib.models import BaseModel

class CategoriaModel(BaseModel):
    __tablename__ = 'categorias'

    pk_id = Column(Integer, primary_key=True)
    nome = Column(String(50), unique=True, nullable=False)
    atletas = relationship('AtletaModel', back_populates='categoria')

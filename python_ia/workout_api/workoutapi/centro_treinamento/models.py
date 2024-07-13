from sqlalchemy import Column, Integer, String
from sqlalchemy.orm import relationship
from contrib.models import BaseModel

class CentroTreinamentoModel(BaseModel):
    __tablename__ = 'centros_treinamento'

    pk_id = Column(Integer, primary_key=True)
    nome = Column(String(50), unique=True, nullable=False)
    endereco = Column(String(60), nullable=False)
    proprietario = Column(String(30), nullable=False)
    atletas = relationship('AtletaModel', back_populates='centro_treinamento')

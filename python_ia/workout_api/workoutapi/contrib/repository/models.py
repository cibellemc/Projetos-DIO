from sqlalchemy.orm import relationship
from .models import AtletaModel, CategoriaModel, CentroTreinamentoModel

AtletaModel.categoria = relationship('CategoriaModel', back_populates='atletas')
AtletaModel.centro_treinamento = relationship('CentroTreinamentoModel', back_populates='atletas')
CategoriaModel.atletas = relationship('AtletaModel', back_populates='categoria')
CentroTreinamentoModel.atletas = relationship('AtletaModel', back_populates='centro_treinamento')

package me.dio.DesafioAPI.domain.repositories;

import me.dio.DesafioAPI.domain.models.Debt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebtRepository extends JpaRepository<Debt, Long> {
    // Adicione métodos personalizados, se necessário
}

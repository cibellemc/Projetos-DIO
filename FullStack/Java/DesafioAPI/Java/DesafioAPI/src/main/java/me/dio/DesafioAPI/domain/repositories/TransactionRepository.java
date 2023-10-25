package me.dio.DesafioAPI.domain.repositories;

import me.dio.DesafioAPI.domain.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // Adicione métodos personalizados, se necessário
}

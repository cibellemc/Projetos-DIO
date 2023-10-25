package me.dio.DesafioAPI.domain.repositories;

import me.dio.DesafioAPI.domain.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Adicione métodos personalizados, se necessário
}

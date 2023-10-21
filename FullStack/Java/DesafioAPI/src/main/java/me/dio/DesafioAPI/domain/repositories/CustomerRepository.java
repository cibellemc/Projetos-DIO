package me.dio.DesafioAPI.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import me.dio.DesafioAPI.domain.models.Customer;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Método para encontrar todos os clientes
    List<Customer> findAll();

    // Método para encontrar um cliente por ID
    Optional<Customer> findById(Long customerId);

    // Método para salvar ou atualizar um cliente
    Customer save(Customer customer);

    // Método para excluir um cliente por ID
    void deleteById(Long customerId);
}

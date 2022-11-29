package dio.aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.aula.model.User;

// podemos usar os métodos 
public interface UserRepository extends JpaRepository <User, Integer> {
    
}

package me.dio.DesafioAPI.services;

import jakarta.persistence.EntityNotFoundException;
import me.dio.DesafioAPI.domain.models.Debt;
import me.dio.DesafioAPI.domain.repositories.DebtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DebtService {
    private final DebtRepository debtRepository;

    @Autowired
    public DebtService(DebtRepository debtRepository) {
        this.debtRepository = debtRepository;
    }

    public List<Debt> getAllDebts() {
        return debtRepository.findAll();
    }

    public Debt getDebtById(Long debtId) {
        return debtRepository.findById(debtId)
                .orElseThrow(() -> new EntityNotFoundException("Debt not found"));
    }

    public Debt createDebt(Debt debt) {
        return debtRepository.save(debt);
    }

    public Debt updateDebt(Long debtId, Debt debt) {
        // Implemente a lógica para atualizar um débito existente
        return debtRepository.save(debt);
    }

    public void deleteDebt(Long debtId) {
        debtRepository.deleteById(debtId);
    }
}

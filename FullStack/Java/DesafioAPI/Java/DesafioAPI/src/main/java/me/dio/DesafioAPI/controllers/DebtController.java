package me.dio.DesafioAPI.controllers;

import me.dio.DesafioAPI.domain.models.Debt;
import me.dio.DesafioAPI.services.DebtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/debts")
public class DebtController {
    private final DebtService debtService;

    @Autowired
    public DebtController(DebtService debtService) {
        this.debtService = debtService;
    }

    @GetMapping
    public List<Debt> getAllDebts() {
        return debtService.getAllDebts();
    }

    @GetMapping("/{debtId}")
    public Debt getDebtById(@PathVariable Long debtId) {
        return debtService.getDebtById(debtId);
    }

    @PostMapping
    public Debt createDebt(@RequestBody Debt debt) {
        return debtService.createDebt(debt);
    }

    @PutMapping("/{debtId}")
    public Debt updateDebt(@PathVariable Long debtId, @RequestBody Debt debt) {
        return debtService.updateDebt(debtId, debt);
    }

    @DeleteMapping("/{debtId}")
    public void deleteDebt(@PathVariable Long debtId) {
        debtService.deleteDebt(debtId);
    }
}

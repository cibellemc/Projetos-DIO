package me.dio.DesafioAPI.controllers;

import me.dio.DesafioAPI.domain.models.Transaction;
import me.dio.DesafioAPI.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @GetMapping("/{transactionId}")
    public Transaction getTransactionById(@PathVariable Long transactionId) {
        return transactionService.getTransactionById(transactionId);
    }

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.createTransaction(transaction);
    }

    @PutMapping("/{transactionId}")
    public Transaction updateTransaction(@PathVariable Long transactionId, @RequestBody Transaction transaction) {
        return transactionService.updateTransaction(transactionId, transaction);
    }

    @DeleteMapping("/{transactionId}")
    public void deleteTransaction(@PathVariable Long transactionId) {
        transactionService.deleteTransaction(transactionId);
    }
}

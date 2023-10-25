package me.dio.DesafioAPI.domain.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "tb_debt")
public class Debt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double amountDue;

    // Mapeamento da relação com o Customer
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    // Mapeamento da relação com a Transaction
    @OneToOne
    @JoinColumn(name = "transaction_id")
    private Transaction transaction;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}
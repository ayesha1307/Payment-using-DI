package com.example.Minions;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(false)
public class PaymentManager {

    private PaymentService paymentService;

    @Value("${payments.currency}")
    private String currency;

    @Value("${payments.limit}")
    private int limit;

    @Autowired
    public PaymentManager(
            @Qualifier("netPayment") PaymentService paymentService) {

        System.out.println("Constructor → PaymentManager");

        this.paymentService = paymentService;
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct → PaymentManager created");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("PreDestroy → PaymentManager destroyed");
    }

    public void processPayment(double amount) {

        System.out.println("Currency: " + currency);
        System.out.println("Limit: " + limit);

        paymentService.pay(amount);
    }
}
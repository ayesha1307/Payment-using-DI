package com.example.Minions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentManager {

    private PaymentService paymentService;

    @Value("${payments.currency}")
    private String currency;

    @Value("${payments.limit}")
    private int limit;

    @Autowired
    public PaymentManager(@Qualifier("netbankingPayment") PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void processPayment(double amount){

        System.out.println("Currency: " + currency);
        System.out.println("Limit: " + limit);

        paymentService.pay(amount);
    }
}
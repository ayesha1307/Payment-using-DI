package com.example.Minions;

import org.springframework.stereotype.Service;

@Service("netbankingPayment")
public class Net implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.println("Payment done using NetBanking: " + amount);
    }
}
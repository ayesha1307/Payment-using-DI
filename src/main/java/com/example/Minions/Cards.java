package com.example.Minions;

import org.springframework.stereotype.Service;

@Service("cardPayment")
public class Cards implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.println("Payment done using Card: " + amount);
    }
}
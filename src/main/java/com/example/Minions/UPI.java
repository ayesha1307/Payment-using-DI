package com.example.Minions;

import org.springframework.stereotype.Service;

@Service("upiPayment")
public class UPI implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.println("Payment done using UPI: " + amount);
    }
}
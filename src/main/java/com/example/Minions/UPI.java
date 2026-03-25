package com.example.Minions;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Lazy
@Service("upiPayment")
public class UPI implements PaymentService {

    public UPI() {
        System.out.println("UPI Bean Created");
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment done using UPI: " + amount);
    }
}
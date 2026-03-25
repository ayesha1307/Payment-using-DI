package com.example.Minions;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Lazy
@Service("netPayment")
public class Net implements PaymentService {

    public Net() {
        System.out.println("NetBanking Bean Created");
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment done using NetBanking: " + amount);
    }
}
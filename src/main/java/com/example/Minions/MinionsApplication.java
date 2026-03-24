package com.example.Minions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MinionsApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(MinionsApplication.class, args);

        PaymentManager pm = context.getBean(PaymentManager.class);

        pm.processPayment(500);
    }
}
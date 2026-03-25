package com.example.Minions;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MinionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MinionsApplication.class, args);
    }

    @Bean
    CommandLineRunner run(PaymentManager pm) {
        return args -> {

            System.out.println("Spring Started");

            pm.processPayment(500);
        };
    }
}
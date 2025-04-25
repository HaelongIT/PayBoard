package com.example.incu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class IncuApplication {

    public static void main(String[] args) {
        SpringApplication.run(IncuApplication.class, args);
    }

}

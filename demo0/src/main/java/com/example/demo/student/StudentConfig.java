package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
           Student q= new Student(
                "Qasim",
                "qasem@gmail.com",
                LocalDate.of(1996,12,12) ,
                25
            );
            Student q2= new Student(
                    "Mohammad",
                    "mohammad@gmail.com",
                    LocalDate.of(1996,12,12) ,
                    23
            );
            repository.saveAll(List.of(q,q2));
        };
    }
}

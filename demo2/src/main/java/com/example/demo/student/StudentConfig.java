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
            Student qasem=new Student(
                    "QASem",
                    "qasem@gmail.com",
                    LocalDate.of(1993,5,25)
            );
            Student qasem2=new Student(
                    "Qasim",
                    "qasem@gmail.com",
                    LocalDate.of(1990,5,25)
            );
            repository.saveAll(List.of(qasem,qasem2));
        };
    }
}

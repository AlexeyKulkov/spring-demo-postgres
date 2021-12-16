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
            Student mariam = new Student(
                    "Mar",
                    "mar@mail",
                    LocalDate.of(2004, 10, 10));
            Student alex = new Student(
                    "Alex",
                    "alex@mail",
                    LocalDate.of(2004, 10, 10));
            repository.saveAll(List.of(mariam, alex));
        };
    }

}

package com.example.springsimpleapi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.DECEMBER;
import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariana = new Student(
                    "Mariana",
                    "mariana.marketing@hotmail.com",
                    LocalDate.of(1996, DECEMBER, 25)
            );

            Student sabrina = new Student(
                    "Sabrina",
                    "sabrina.design@outlook.com",
                    LocalDate.of(1998, JANUARY, 15)
            );

            repository.saveAll(List.of(mariana, sabrina));
        };
    }
}

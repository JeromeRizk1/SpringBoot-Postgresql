package com.example.demo7.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jerome = new Student(
                    "jerome",
                    "jerome_rizk@hotmail.com",
                    LocalDate.of(1996, Month.DECEMBER, 8)
            );

            Student matilda = new Student(
                    "matilda",
                    "matilda_khoury@hotmail.com",
                    LocalDate.of(2000, Month.JANUARY, 16)
            );

            repository.saveAll(
                    List.of(jerome, matilda)
            );
        };
    }
}

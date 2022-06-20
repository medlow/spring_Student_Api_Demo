package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
@Bean
    CommandLineRunner commandLineRunner (StudentRepository repository) {
        return args -> {

                   Student mouhamed = new Student(
                           "Mouhamed",
                            "mouhamedlo@gmail.com",
                            LocalDate.of(2000, Month.JANUARY, 1)
                    );
            Student demba = new Student(
                    "demba",
                    "demba@gmail.com",
                    LocalDate.of(2001, Month.FEBRUARY, 2)
            );
            Student aissatou = new Student(
                    "aissatou",
                    "aissatou@gmail.com",
                    LocalDate.of(2002, Month.MARCH, 3)
            );
            Student fallou = new Student(
                    "fallou",
                    "fallou@gmail.com",
                    LocalDate.of(2003, Month.APRIL, 4)
            );
            repository.saveAll(List.of(mouhamed,demba,aissatou,fallou));

        };
    }
}

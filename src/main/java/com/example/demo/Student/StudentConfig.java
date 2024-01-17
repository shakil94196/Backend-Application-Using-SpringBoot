package com.example.demo.Student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.MARCH;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args->{
           Student faiza= new Student(

                    "Faiza",
                    "shakil77977@gmail.com",
                    LocalDate.of(2000, MARCH,3),
                    21
            );

            Student fahim= new Student(

                    "fahim",
                    "shakil77977@gmail.com",
                    LocalDate.of(2000, MARCH,3),
                    21
            );

            Student lamisa= new Student(

                    "lamisa",
                    "shakil77977@gmail.com",
                    LocalDate.of(2000, MARCH,3),
                    21
            );

            repository.saveAll(
                    List.of(faiza,fahim,lamisa)
            );

        };
    }


}

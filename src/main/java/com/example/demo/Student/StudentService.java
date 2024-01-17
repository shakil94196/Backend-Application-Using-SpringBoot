package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student>getStudents(){
        return studentRepository.findAll();


                /*List.of(

                new Student(
                        1L,
                        "Faiza",
                        "shakil77977@gmail.com",
                        LocalDate.of(2000, Month.MARCH,3),
                        21
                )
        );*/
    }
}

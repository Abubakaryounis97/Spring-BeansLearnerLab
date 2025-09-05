package com.zipcode.lab2Week9.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zipcode.lab2Week9.Student;
import com.zipcode.lab2Week9.Students;

@Configuration
public class StudentConfig {
    @Bean(name = "students")
    public Students currentStudents() {
        // Create student instances for the current cohort
        Student s1 = new Student(1L, "Alice");
        Student s2 = new Student(2L, "Bob");
        Student s3 = new Student(3L, "Charlie");

        // Add them to a Students container
        Students currentStudents = new Students(s1, s2, s3);

        // Return the Students object
        return currentStudents;
    }

    @Bean(name = "previousStudents")
    public Students previousStudents() {
        // Create student instances for the previous cohort
        Student p1 = new Student(4L, "Dave");
        Student p2 = new Student(5L, "Eve");
        Student p3 = new Student(6L, "Frank");

        // Add them to a Students container
        Students previousStudents = new Students(p1, p2, p3);

        // Return the Students object
        return previousStudents;
    }
    }



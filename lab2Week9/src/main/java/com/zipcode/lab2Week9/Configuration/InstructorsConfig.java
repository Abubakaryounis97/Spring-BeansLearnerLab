package com.zipcode.lab2Week9.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.zipcode.lab2Week9.Instructor;
import com.zipcode.lab2Week9.Instructors;

@Configuration
public class InstructorsConfig {

    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors() {
        
        Instructor i1 = new Instructor(1L, "Kris");
        Instructor i2 = new Instructor(2L, "Paul");

        
        return new Instructors(i1, i2);
    }

    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors() {

        Instructor i1 = new Instructor(3L, "Younis");
        Instructor i2 = new Instructor(4L, "Abubakar");

       
        return new Instructors(i1, i2);
    }

    @Bean(name = "instructors")
    @Primary
    public Instructors instructors() {
    
        Instructors usaInstructors = tcUsaInstructors();
        Instructors ukInstructors = tcUkInstructors();


        Instructors allInstructors = new Instructors();
        allInstructors.addAll(usaInstructors);
        allInstructors.addAll(ukInstructors);

        return allInstructors;
    }
}

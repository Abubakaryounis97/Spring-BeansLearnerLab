package com.zipcode.lab2Week9.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zipcode.lab2Week9.Instructor;
import com.zipcode.lab2Week9.Instructors;
import com.zipcode.lab2Week9.Students;

import jakarta.annotation.PostConstruct; // or javax.annotation.PostConstruct depending on your setup

@Service
public class AlumniService {

    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;

    @Autowired
    private Instructors instructors;

    private final double TOTAL_HOURS_PER_STUDENT = 1200;

    @PostConstruct
    public void executeBootcamp() {
        int numberOfStudents = previousStudents.size();
        int numberOfInstructors = instructors.size();

        double totalHoursToTeach = TOTAL_HOURS_PER_STUDENT * numberOfStudents;

    
        double hoursPerInstructor = totalHoursToTeach / numberOfInstructors;

        
        for (Instructor instructor : instructors) {
            instructor.lecture(previousStudents, hoursPerInstructor);
        }
    }

  
    public Students getPreviousStudents() {
        return previousStudents;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}

package com.zipcode.lab2Week9;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class StudentConfigTest {

   @Autowired
    @Qualifier("students")
    private Students currentStudents;

    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;

    @Test
    void testCurrentStudentsBeanIsNotNull() {
        assertNotNull(currentStudents, "Current students bean should not be null");
    
    }

    @Test
    void testPreviousStudentsBeanIsNotNull() {
        assertNotNull(previousStudents, "Previous students bean should not be null");
    
    }

    @Test
    void testCurrentStudentsNotEmpty() {
        assertTrue(currentStudents.size() > 0, "Current students list should not be empty");
    }

    @Test
    void testPreviousStudentsNotEmpty() {
        assertTrue(previousStudents.size() > 0, "Previous students list should not be empty");
    }
}

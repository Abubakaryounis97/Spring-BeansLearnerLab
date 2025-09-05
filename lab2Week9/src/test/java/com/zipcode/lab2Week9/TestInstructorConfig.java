package com.zipcode.lab2Week9;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestInstructorConfig {
    
    @Autowired
    private Instructors instructors;

    @Autowired
    @Qualifier("tcUkInstructors")
    private Instructors ukInstructors;

    @Autowired
    @Qualifier("tcUsaInstructors")
    private Instructors usaInstructors;

    @Test
    void testInstructorsBeanIsNotNull() {
        assertNotNull(instructors, "Instructors bean should not be null");
    }
    @Test
    void testUkInstructorsBeanIsNotNull() {
        assertNotNull(ukInstructors, "UK Instructors bean should not be null");
    }

    @Test
    void testUsaInstructorsBeanIsNotNull() {
        assertNotNull(usaInstructors, "USA Instructors bean should not be null");
    }
}

package com.zipcode.lab2Week9;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestClassRoomConfig {

    @Autowired
    @Qualifier("currentCohort")
    private Classroom currentCohort;

    @Autowired
    @Qualifier("previousCohort")
    private Classroom previousCohort;

    @Test
    void testCurrentCohortBeanIsNotNull() {
        assertNotNull(currentCohort, "Current cohort bean should not be null");
        System.out.println("Current Cohort: " + currentCohort);
    }

    @Test
    void testPreviousCohortBeanIsNotNull() {
        assertNotNull(previousCohort, "Previous cohort bean should not be null");
        System.out.println("Previous Cohort: " + previousCohort);
    }
}

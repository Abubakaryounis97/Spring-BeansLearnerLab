package com.zipcode.lab2Week9;

public class Instructor extends Person implements Teacher {

    // Constructor
    public Instructor(long id, String name) {
        super(id, name); // call Person constructor
    }

    // Teach a single learner
    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    // Lecture multiple learners
    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        // Count the number of learners
        int count = 0;
        for (Learner l : learners) {
            count++;
        }

        if (count == 0) return; // avoid division by zero

        double numberOfHoursPerLearner = numberOfHours / count;

        // Teach each learner
        for (Learner l : learners) {
            l.learn(numberOfHoursPerLearner);
        }
    }
}

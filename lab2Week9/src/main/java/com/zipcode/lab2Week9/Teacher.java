package com.zipcode.lab2Week9;

public interface Teacher {

    // Teach a single learner for a number of hours
    void teach(Learner learner, double numberOfHours);

    // Lecture a group of learners for a total number of hours
    void lecture(Iterable<? extends Learner> learners, double numberOfHours);
}

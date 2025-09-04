package com.zipcode.lab2Week9;

public class Student extends Person implements Learner {

    private double totalStudyTime;  // tracks total hours studied

    // Constructor
    public Student(long id, String name) {
        super(id, name);  // call the Person constructor
        this.totalStudyTime = 0.0; // initialize study time
    }

    // Implement the learn method from Learner interface
    @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    // Getter for totalStudyTime
    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}

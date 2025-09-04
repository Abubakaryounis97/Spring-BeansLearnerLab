package com.zipcode.lab2Week9;

public class Instructors extends People<Instructor> {

    // Constructor with varargs of Instructor objects
    public Instructors(Instructor... instructors) {
        super(instructors); // pass to People constructor
    }
}

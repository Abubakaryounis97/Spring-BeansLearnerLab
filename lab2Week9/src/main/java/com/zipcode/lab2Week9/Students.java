package com.zipcode.lab2Week9;

public class Students extends People<Student> {

    // Constructor with varargs of Student objects
    public Students(Student... students) {
        super(students); // pass to People constructor
    }
}

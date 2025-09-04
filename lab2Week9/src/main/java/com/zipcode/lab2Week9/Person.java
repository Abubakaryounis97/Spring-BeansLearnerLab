package com.zipcode.lab2Week9;

public class Person {
    private final long id;  // final field, cannot be changed after construction
    private String name;    // mutable field

    // Constructor
    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter for id
    public long getId() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
}


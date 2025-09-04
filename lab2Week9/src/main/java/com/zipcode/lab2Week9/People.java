package com.zipcode.lab2Week9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {

    protected List<PersonType> personList;

    // Constructor with varargs
    @SafeVarargs
    public People(PersonType... persons) {
        personList = new ArrayList<>();
        for (PersonType p : persons) {
            personList.add(p);
        }
    }

    // Add a person
    public void add(PersonType person) {
        personList.add(person);
    }

    // Remove a person
    public void remove(PersonType person) {
        personList.remove(person);
    }

    // Size of the list
    public int size() {
        return personList.size();
    }

    // Clear the list
    public void clear() {
        personList.clear();
    }

    // Add all from an Iterable
    public void addAll(Iterable<PersonType> persons) {
        for (PersonType p : persons) {
            personList.add(p);
        }
    }

    // Find a person by id
    public PersonType findById(long id) {
        for (PersonType p : personList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null; // not found
    }

    // Return all people
    public List<PersonType> findAll() {
        return personList;
    }

    // Iterable implementation
    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }
}

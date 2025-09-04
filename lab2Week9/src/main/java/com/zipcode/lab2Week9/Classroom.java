package com.zipcode.lab2Week9;

public class Classroom {

    private final Students students;
    private final Instructors instructors;

    // Constructor
    public Classroom(Instructors instructors, Students students) {
        this.instructors = instructors;
        this.students = students;
    }

    // Host a lecture using a Teacher (Instructor)
    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students, numberOfHours);
    }

    // Optional getters
    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}

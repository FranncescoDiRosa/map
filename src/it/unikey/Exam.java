package it.unikey;

import java.time.LocalDate;
import java.util.Date;


public class Exam {
    private LocalDate date;
    private int result;
    private boolean isWithDistinction;
    private Student student;
    private Course course;
    private static int counter = 0;

    public Exam(LocalDate date, int result, boolean isWithDistinction, Student student, Course course){
        this.date = date;
        this.result = result;
        this.isWithDistinction = isWithDistinction;
        this.student = student;
        this.course = course;

        University.examsList.put(counter, this);
        counter++;

        System.out.println("L'esame di " + course.getName() + " dello studente " + student.getRegistrationNumber()+ " è stato registrato");
    }

    public LocalDate getDate() {
        return date;
    }

    public int getResult() {
        return result;
    }

    public boolean isWithDistinction() {
        return isWithDistinction;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "date=" + date +
                ", result=" + result +
                ", isWithDistinction=" + isWithDistinction +
                ", student=" + student +
                ", course=" + course +
                '}';
    }
}

package it.unikey;

import java.util.ArrayList;

public class ActivitiesRegitry {

    static ArrayList<Course> courses = new ArrayList<>();
    static ArrayList<Exam> exams = new ArrayList<>();

    public static void registerCourse(Course course)
    {
        courses.add(course);
    }

    public static void registerExam(Exam exam, Student student, Course course)
    {
        exams.add(exam);
    }
}

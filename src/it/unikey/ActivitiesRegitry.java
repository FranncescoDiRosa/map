package it.unikey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ActivitiesRegitry {

    static ArrayList<Course> courses = new ArrayList<>();
    static ArrayList<Exam> exams = new ArrayList<>();

    static Map<Student, ArrayList<Exam>> averageScore = new HashMap<>();

    public static void registerCourse(Course course)
    {
            if (courses.contains(course))
            {
                System.out.println("il corso esiste gia");
            }else
            {
                courses.add(course);
            }

    }

    public static void registerExam(Exam exam)
    {
        if (exams.contains(exam))
        {
            System.out.println("questo esame è gia registrato");
        }else
        {
            exams.add(exam);
        }
    }

    public static int averageStudentExamScore(Student student)
    {
        int averageReturn = 0;



        return averageReturn;
    }

}

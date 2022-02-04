package it.unikey;

import java.util.ArrayList;

public class StudentsRegistry {

    static ArrayList<Student> registry = new ArrayList<>();

    public static void registerStudent(Student student)
    {
        registry.add(student);
    }

}

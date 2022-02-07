package it.unikey;

import java.util.ArrayList;

public class StudentsRegistry {

    static ArrayList<Student> registry = new ArrayList<>();

    public static void registerStudent(Student student)
    {
        if (registry.contains(student))
        {
            System.out.println("questo studente è gia registrato");
        }
        registry.add(student);
    }

}

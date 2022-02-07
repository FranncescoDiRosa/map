package it.unikey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static it.unikey.Main.mapStudenteCorso;

public class University {
    public static List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student("fb", "Fulvio", "Berretta"),
                    new Student("ap", "Alessio", "Paolucci"),
                    new Student("yd", "Yanik", "Dimitrov")
            )
    );

    public static List<Course> courses = new ArrayList<>(
            Arrays.asList(
                new Course("Java", "Francesco Di Rosa", 6),
                new Course("Python", "Sara Gaudiosi", 6)
            )
    );

    public static void insertStudent(Student student){
        students.add(student);
    }

    public static void inserimentoCorso(Course corso){
        courses.add(corso);
    }

    public static void printAllStudents() {
        System.out.println("stampo gli studenti");
        System.out.println("----------------------------------------------------------");
        University.students
                .stream()
                .map(Student::getNome)
                .forEach(System.out::println);
        System.out.println("-----------------------------------------------------------");
        System.out.println();
    }

//    public List<Student> averageAbove(Double average) {
//        University.students
//                .stream()
//                .filter(ex -> getGradeAverage() > average)
//                .map(e)
//                .collect(Collectors.toList())
//    }

}

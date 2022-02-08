package it.unikey;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public static Map<Student, List<Exam>> mapStudenteCorso = new HashMap<>();

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
    /* ricercare tutti gli studenti che hanno media esami > X */
    public static void above(Double target) {

        mapStudenteCorso.keySet()
                .stream()
                .filter
                (
                    student ->
                    student.returnGradeAverage() > target
                ).forEach(System.out::println);

    }

    public static Double returnAverage(List<Exam> examList) {
               return (examList.stream()
                        .mapToDouble(Exam::getVoto)
                        .sum()) / (examList.size());
    }

}

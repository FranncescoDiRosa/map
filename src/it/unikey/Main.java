package it.unikey;

import java.time.LocalDate;
import java.util.*;

import static it.unikey.University.insertStudent;
import static it.unikey.University.printAllStudents;

public class Main {
    public static Map<Student, List<Exam>> mapStudenteCorso = new HashMap<>();

    public static void main(String[] args) {

        Student mario = new Student("mrss", "Mario", "Red");
        insertStudent(mario);
        printAllStudents();
        mario.insertExam(LocalDate.parse("2021-09-03"), 25, "Java");
        mario.insertExam(LocalDate.parse("2021-09-03"), 25, "Python");
        mario.printStudentExams();
    }










}

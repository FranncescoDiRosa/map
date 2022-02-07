package it.unikey;

import java.time.LocalDate;
import java.util.*;

import static it.unikey.University.insertStudent;
import static it.unikey.University.printAllStudents;

public class Main {
    public static Map<Student, List<Exam>> mapStudenteCorso = new HashMap<>();

    public static void main(String[] args) {
        /*

        4) calcola media esami di uno studente
        5) ricercare tutti gli esami sostenuti tra data X e data Y
        6) ricercare tutti gli studenti che hanno media esami > X
         */

        Student mario = new Student("mrss", "Mario", "Red");
        insertStudent(mario);
        printAllStudents();
        mario.insertExam(LocalDate.parse("2021-09-03"), 8, "Java");
        mario.insertExam(LocalDate.parse("2020-05-01"), 5, "Python");
        mario.printStudentExams();
        System.out.println(mario.getGradeAverage());
        System.out.println(mario.getExamsBetween(LocalDate.parse("2020-04-04"), LocalDate.parse("2020-06-05")));
    }










}

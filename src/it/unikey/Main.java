package it.unikey;

import java.time.LocalDate;
import java.util.*;

import static it.unikey.University.insertStudent;
import static it.unikey.University.printAllStudents;

public class Main {
    public static Map<Student, List<Exam>> mapStudenteCorso = new HashMap<>();

    public static void main(String[] args) {
        /* ricercare tutti gli studenti che hanno media esami > X */
        Student mario = new Student("mrss", "Mario", "Red");
        insertStudent(mario);
        printAllStudents();
        mario.insertExam("2021-09-03", 8, "Java");
        mario.insertExam("2020-05-01", 5, "Python");
        mario.printStudentExams();
        mario.printGradeAverage();
        mario.getExamsBetween("2020-04-04","2020-06-05");
    }










}

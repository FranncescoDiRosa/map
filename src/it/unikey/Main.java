package it.unikey;

import static it.unikey.University.*;

public class Main {


    public static void main(String[] args) {

        Student mario = new Student("mrss", "Mario", "Red");
        insertStudent(mario);
        printAllStudents();
        mario.insertExam("2021-09-03", 8, "Java");
        mario.insertExam("2020-05-01", 5, "Python");
        Student.findStudentByMatricola(2).get().insertExam("2021-09-03", 9, "Java");
        mario.printStudentExams();
        mario.printGradeAverage();
        mario.getExamsBetween("2020-04-04","2020-06-05");
        above(4.0);
    }










}

package it.unikey;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Student alessio = new Student("Alessio", "Giannetti");
        University.addStudent(alessio);

        Student luca = new Student("Luca", "Bianchi");
        University.addStudent(luca);

        Student mario = new Student("Mario", "Bianchi");
        University.addStudent(mario);

        Course fisica = new Course("Fisica");
        University.addCourse(fisica);

        Course java = new Course("Java");
        University.addCourse(java);

        Course Matematica = new Course("Matematica");
        University.addCourse(Matematica);

        Exam esame = new Exam(LocalDate.parse("2022-01-20"), 24);
        University.insertExam(esame, mario, fisica);

        Exam esame1 = new Exam(LocalDate.parse("2012-02-12"), 30);
        University.insertExam(esame1, alessio, fisica);

        Exam esame2 = new Exam(LocalDate.parse("2013-05-15"), 18);
        University.insertExam(esame2, alessio, java);

        Exam esame4 = new Exam(LocalDate.parse("2014-10-05"), 30);
        University.insertExam(esame4, alessio, Matematica);

        System.out.println(University.calcAvarage(mario));

        //System.out.println(exam.idExam);
        System.out.println(esame1.idExam);
        System.out.println(esame2.idExam);
        System.out.println(University.listStudent);
        System.out.println(University.listExam);

        System.out.println(University.mediaMaxStudent(24));

        System.out.println(University.serchExam(LocalDate.parse("2011-02-20"), LocalDate.parse("2014-09-20")));


    }
}


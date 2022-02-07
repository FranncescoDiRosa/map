package it.unikey;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        System.out.println("Istanziazione e registrazione di studenti, corsi ed esami");

        Student student1 = new Student(123456, "hjgikjjighfig", "nomeacaso", "cognomeacaso");
        Student student2 = new Student(789012, "uhjghjghjgjhb", "nomeacasoo", "cognomeacasoo");
        Student student3 = new Student(345678, "bvbnghjrfjdbg", "nomeacasooo", "cognomeacasooo");

        Course course1 = new Course("fgujf", "nomecorso", "insegnanteacaso", 12);
        Course course2 = new Course("ghgfh", "nomecorsoo", "insegnanteacasoo", 12);
        Course course3 = new Course("gdfgd", "nomecorsooo", "insegnanteacasooo", 12);

        LocalDate date1 = LocalDate.of(2020,12,12);
        LocalDate date2 = LocalDate.of(2019,10,12);
        LocalDate date3 = LocalDate.of(2020,2,23);
        LocalDate date4 = LocalDate.of(2018,5,25);

        Exam exam1 = new Exam(date1, 19, false, student1, course1);
        Exam exam2 = new Exam(date2, 27, false, student3, course1);
        Exam exam3 = new Exam(date3, 30, true, student2, course3);
        Exam exam4 = new Exam(date4, 21, false, student1, course2);

        System.out.println("---------------------------------");
        System.out.println("Inserimento nuovi elementi");
        InputManager.createNewStudent();
        InputManager.createNewCourse();
        InputManager.createNewExam();

        System.out.println("---------------------------------");
        System.out.println("Media di uno studente");
        System.out.println(University.getAvg(2));

        System.out.println("---------------------------------");
        System.out.println("Esami tra due date");
        University.getExamsBetweenDates();

        System.out.println("---------------------------------");
        System.out.println("Studenti con media sopra un certo valore");
        University.getStudentsOverAvg(24);



    }
}

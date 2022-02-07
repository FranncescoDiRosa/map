package it.unikey;

import java.time.LocalDate;
import java.util.*;

public class InputManager {

    public static Student createNewStudent(){
        System.out.println("Inserisci numero di matricola, codice fiscale, nome e cognome in questo ordine.");
        int registrationNumber = inputIntFields();
        String fiscalCode = new Scanner(System.in).nextLine();
        String name = new Scanner(System.in).nextLine();
        String surname = new Scanner(System.in).nextLine();
        Student newStudent = new Student(registrationNumber, fiscalCode, name, surname);
        return newStudent;
    }

    public static Course createNewCourse(){
        System.out.println("Inserisci codice, nome, insegnante e cfu in questo ordine.");
        System.out.println("Inserisci codice");
        String code = new Scanner(System.in).nextLine();
        System.out.println("Inserisci nome");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Inserisci insegnante");
        String teacher = new Scanner(System.in).nextLine();
        System.out.println("Inserisci cfu");
        int cfu = inputIntFields();
        Course newCourse = new Course(code, name, teacher, cfu);
        return newCourse;
    }

    public static Exam createNewExam(){
        System.out.println("Inserisci data, risultato, codice studente e codice corso in questo ordine.");
        LocalDate date = inputDate();
        System.out.println("Inserisci voto");
        int result = 0;

        do{
            result = inputIntFields();
        }while(result > 30 || result < 18);

        boolean isWithDistinction = false;

        if(result == 30){
            System.out.println("L'esame è stato valutato con lode? (Y/N)");
            String withDistinction = "";
            do{
                withDistinction = new Scanner(System.in).nextLine().toLowerCase(Locale.ROOT);
            }while(!withDistinction.equals("y") && !withDistinction.equals("n"));
            if(withDistinction.equals("y")){
                isWithDistinction = true;
            }
        }

        System.out.println("Inserisci codice studente");

        int studentCode = 0;

        System.out.println("Inserisci codice corso");

        int courseCode = 0;

        do{
            studentCode = inputIntFields();
        }while (!University.studentsList.containsKey(studentCode));

        do{
            courseCode = inputIntFields();
        }while (!University.studentsList.containsKey(courseCode));

        Exam newExam = new Exam(date, result, isWithDistinction, University.studentsList.get(studentCode), University.coursesList.get(courseCode));

        return newExam;
    }

    public static int inputIntFields() {
        Scanner inputInt = new Scanner(System.in);
        while (true) {
            try {
                return inputInt.nextInt();
            }
            catch (java.util.InputMismatchException e) {
                System.out.println("Inserisci un valore numerico!");
                inputInt.nextLine();
            }
        }
    }

    public static LocalDate inputDate(){
        int year = 0;
        int month =0;
        int day = 0;

        System.out.println("Inserisci un anno compreso tra 1970 e 2021");
        do {
            year = inputIntFields();
        }while(year < 1970 || year > 2021);

        System.out.println("Inserisci un mese compreso tra 1 e 12");
        do {
            month = inputIntFields();
        }while(month < 1 || month > 12);

        System.out.println("Inserisci un giorno adeguato");

        if(month == 4 || month == 6 || month == 9 || month == 11){
            do {
                day = inputIntFields();
            }while (day < 1 || day > 30);
        }else if(month == 2){
            if (year % 4 == 0){
                do {
                    day = inputIntFields();
                }while (day < 1 || day > 29);
            }else{
                do {
                    day = inputIntFields();
                }while (day < 1 || day > 28);
            }
        }else{
            do {
                day = inputIntFields();
            }while (day < 1 || day > 31);
        }

        LocalDate date = LocalDate.of(year, month, day);

        return date;
    }
}
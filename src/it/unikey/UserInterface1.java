package it.unikey;

import java.util.Date;
import java.util.Scanner;

public class UserInterface1 {

    boolean start = true;
    Scanner scanner1 = new Scanner(System.in);

    public void menu()
    {
        while (start == true)
        {
            System.out.println("cosa vuoi fare? \n" +
                               "1. inserisci studente \n" +
                               "2. inserisci corso \n" +
                               "3. inserisci esame \n" +
                               "4. calcola la media dei voti di esame di uno studente \n" +
                               "5. trova tutti gli esami svolti in un determinato lasso di tempo \n" +
                               "6. trova tutti gli studenti con una specifica media scolastica \n" +
                               "7. esci");;

            int mainChoice = scanner1.nextInt();
            scanner1.nextLine();

            switch (mainChoice)
            {
                case 1:
                    boolean case1Check = true;
                    while (case1Check == true) {
                        System.out.println("inserisci il codice fiscale dello studente");
                        String fCode = scanner1.nextLine();
                        System.out.println("inserisci il nome dello studente");
                        String firstName = scanner1.nextLine();
                        System.out.println("inserisci il cognome dello studente");
                        String lastName = scanner1.nextLine();

                        Student student = new Student(fCode, firstName, lastName);

                        StudentsRegistry.registerStudent(student);

                        System.out.println("vuoi inserire un altro studente? y/n");
                        String yn = scanner1.nextLine();
                        switch (yn) {
                            case "y":
                                case1Check = true;
                            break;
                            case "n":
                                case1Check = false;
                            break;
                            default:
                                System.out.println("dovevi inserire 'y' o 'n'... well too late now isn't it");
                                case1Check = false;
                        }


                    }
                break;

                case 2:
                    boolean case2Check = true;
                    while (case2Check == true)
                    {
                        System.out.println("inserisci la materia");
                        String subject = scanner1.nextLine();
                        System.out.println("inserisci il professore incaricato");
                        String professor = scanner1.nextLine();
                        System.out.println("inserisci la quantità di crediti erogati dal corso");
                        int credits = Integer.parseInt(scanner1.nextLine());

                        Course course = new Course();
                        ActivitiesRegitry.registerCourse(course);

                        System.out.println("vuoi inserire un altro corso? y/n");
                        String yn = scanner1.nextLine();
                        switch (yn) {
                            case "y":
                                case2Check = true;
                            break;
                            case "n":
                                case2Check = false;
                            break;
                            default:
                                System.out.println("dovevi inserire 'y' o 'n'... well too late now isn't it");
                                case2Check = false;
                        }
                    }
                break;

                case 3:
                    boolean case3Check = true;
                    while (case3Check == true)
                    {
                        System.out.println("inserisci l'anno di esame");
                        int examYear = scanner1.nextInt();
                        System.out.println("inserisci il mese");
                        int examMonth = scanner1.nextInt();
                        System.out.println("inserisci il giorno");
                        int examDay = scanner1.nextInt();

                        Date examDate = new Date(examYear, examMonth, examDay);

                        System.out.println("inserisci il nome dello studente");
                        String studentFirstName = scanner1.nextLine();
                        System.out.println("inserisci il cognome");
                        String studentLastName = scanner1.nextLine();

                        Student randomDonny = null;
                        for (Student student : StudentsRegistry.registry)
                        {
                            if (studentFirstName.equalsIgnoreCase(student.getFirstName()) && studentLastName.equalsIgnoreCase(student.getLastName()))
                            {
                                randomDonny = student;
                            }else
                            {
                                System.out.println("lo studente inserito non esiste");
                                case3Check = false;
                            }
                        }

                        System.out.println("a quale corso appartiene l'esame?");
                        String examCourse = scanner1.nextLine();

                        Course randomCourse = null;
                        for (Course course : ActivitiesRegitry.courses)
                        {
                            if (examCourse.equalsIgnoreCase(course.getSubject()))
                            {
                                randomCourse = course;
                            }else
                            {
                                System.out.println("questo corso non esiste");
                            }
                        }

                        System.out.println("inserisci il puteggio");
                        int examScore = Integer.parseInt(scanner1.nextLine());
                        System.out.println("ha preso la lode? 'yes' o 'no'");
                        String meritString = scanner1.nextLine();
                        boolean meritBool;
                            switch (meritString)
                            {
                                case "yes":
                                   meritBool = true;
                                break;
                                case "no":
                                    meritBool = false;
                                break;
                                default:
                                    meritBool = true;
                            }

                        Exam exam = new Exam(examDate, randomCourse, examScore, meritBool);
                        ActivitiesRegitry.registerExam(exam);

                        System.out.println("vuoi inserire un altro esame? y/n");
                        String yn = scanner1.nextLine();
                        switch (yn) {
                            case "y":
                                case3Check = true;
                                break;
                            case "n":
                                case3Check = false;
                                break;
                            default:
                                System.out.println("dovevi inserire 'y' o 'n'... well too late now isn't it");
                        }
                    }
                break;

                case 4:

                break;

                case 5:

                break;

                case 6:

                break;

                case 7:
                    return;

                default:
                    System.out.println("puoi inserire solo un numero da 1 a 7");;
            }
        }
        //start = false;
    }
}

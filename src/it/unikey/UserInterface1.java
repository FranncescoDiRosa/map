package it.unikey;

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

                            case "n":
                                case1Check = false;
                            default:
                                System.out.println("dovevi inserire 'y' o 'n'... well too late now isn't it");
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
                        int credits = scanner1.nextInt();

                        Course course = new Course();

                        ActivitiesRegitry.registerCourse(course);

                        System.out.println("vuoi inserire un altro corso? y/n");
                        String yn = scanner1.nextLine();
                        switch (yn) {
                            case "y":

                            case "n":
                                case2Check = false;
                            default:
                                System.out.println("dovevi inserire 'y' o 'n'... well too late now isn't it");
                        }
                    }
                break;

                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    return;

                default:
                    System.out.println("puoi inserire solo un numero da 1 a 7");;
            }
        }
        //start = false;
    }
}

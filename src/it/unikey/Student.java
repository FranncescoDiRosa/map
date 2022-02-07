package it.unikey;

public class Student {
    private int registrationNumber;
    private String fiscalCode;
    private String name;
    private String surname;
    private static int counter = 0;

    public Student(int registrationNumber, String fiscalCode, String name, String surname){
        this.registrationNumber = registrationNumber;
        this.fiscalCode =  fiscalCode;
        this.name = name;
        this.surname = surname;

        University.studentsList.put(counter, this);
        counter++;

        System.out.println("La matricola " + registrationNumber + " è stata registrata");
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}

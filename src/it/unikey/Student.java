package it.unikey;

public class Student {

    private static int counter = 0;
    private int idCodeStudent;
    private String fCode;
    private String firstName;
    private String lastName;

    public Student() {
    }

    public Student(String fCode, String firstName, String lastName) {
        counter ++;
        this.idCodeStudent = counter;
        this.fCode = fCode;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getIdCodeStudent() {
        return idCodeStudent;
    }

    public void setIdCodeStudent(int idCodeStudent) {
        this.idCodeStudent = idCodeStudent;
    }

    public String getfCode() {
        return fCode;
    }

    public void setfCode(String fCode) {
        this.fCode = fCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

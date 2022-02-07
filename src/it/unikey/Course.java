package it.unikey;

public class Course {

    private static int counter = 0;
    private int idCodeCourse;
    private String subject;
    private String professor;
    private int creditsGiven;

    Student student = new Student();

    public Course() {
    }

    public Course(String subject, String professor, int creditsGiven) {
        counter++;
        this.idCodeCourse = counter;
        this.subject = subject;
        this.professor = professor;
        this.creditsGiven = creditsGiven;
    }

    public int getIdCodeCourse() {
        return idCodeCourse;
    }

    public void setIdCodeCourse(int idCodeCourse) {
        this.idCodeCourse = idCodeCourse;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public int getCreditsGiven() {
        return creditsGiven;
    }

    public void setCreditsGiven(int creditsGiven) {
        this.creditsGiven = creditsGiven;
    }


    public boolean equals(Course course) {

        if (course == null)
        {
            return false;
        }

        if (this == course)
        {
            return true;
        }

        if (this.getIdCodeCourse() == course.getIdCodeCourse() && this.getSubject() == course.getSubject())
        {
            return true;
        }

        return false;
    }
}

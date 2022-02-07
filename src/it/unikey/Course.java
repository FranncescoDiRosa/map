package it.unikey;


import java.util.Optional;

public class Course {

    private int counter;
    private String codice;
    private String courseName;
    private String docente;
    private int cfu;
    //private Esame esame;

    public Course(String materia, String docente, int cfu) {
        counter++;
        this.codice = counter + "";
        this.courseName = materia;
        this.docente = docente;
        this.cfu = cfu;
    }

    public static Optional<Course> findCourseByName(String name) {
        return University.courses
                .stream()
                .filter(course -> course.getCourseName().equalsIgnoreCase(name))
                .findFirst();
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public int getCfu() {
        return cfu;
    }

    public void setCfu(int cfu) {
        this.cfu = cfu;
    }

}

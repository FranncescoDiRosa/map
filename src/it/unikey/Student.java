package it.unikey;

import it.unikey.exception.NotFoundException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static it.unikey.Course.findCourseByName;
import static it.unikey.Main.mapStudenteCorso;

public class Student {

    private int matricola;
    private String codiceFiscale;
    private String nome;
    private String cognome;
    private static int counter;

    public Student(String codiceFiscale, String nome, String cognome) {
        counter ++;
        this.matricola = counter;
        this.codiceFiscale = codiceFiscale;
        this.nome = nome;
        this.cognome = cognome;
    }

    public boolean studentIsPresentInHashMap() {
        for (Student stud : mapStudenteCorso.keySet()) {
            if(stud.matricola == this.matricola)
                return true;
        }
        return false;
    }

    public void insertExam(String date, int grade, String courseName) {
        Course course  = findCourseByName(courseName).orElseThrow(() -> new NotFoundException("Course not found"));

        Exam exam = new Exam(
                LocalDate.parse(date),
                grade,
                course
        );

        if (!studentIsPresentInHashMap()) {
            mapStudenteCorso.put(this, new ArrayList<>(Arrays.asList(exam)));
        } else {
            mapStudenteCorso.get(this).add(exam);
        }



    }

    public List<Exam> getExamList() {
        return new ArrayList<>(mapStudenteCorso.get(this));
    }


    public static Optional<Student> findStudentByMatricola(int matricola) {
        return University.students
                .stream()
                .filter(st -> st.getMatricola() == matricola)
                .findFirst();
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public void printStudentExams() {
        mapStudenteCorso.get(this).forEach(System.out::println);
    }

    public String getNome() {
        return nome;
    }

    public void printGradeAverage() {
        System.out.println(
                (mapStudenteCorso.get(this)
                                .stream()
                                .mapToDouble(Exam::getVoto)
                                .sum()) / (mapStudenteCorso.get(this).size())
        );

    }

    public void getExamsBetween(String start, String end) {
        mapStudenteCorso.get(this)
                .stream()
                .filter
                (
                        examDate ->
                        examDate.getDataEsame().isAfter(LocalDate.parse(start))
                        && examDate.getDataEsame().isBefore(LocalDate.parse(end))
                )
                .forEach(System.out::println);

    }





}

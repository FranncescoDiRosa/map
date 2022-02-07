package it.unikey;

import java.time.LocalDate;
import java.util.*;


public class Exam {

    public int idExam;
    private static int counter;
    private LocalDate dateExam;
    private int vote;
    boolean lode = false;



    public Exam(LocalDate dateExam, int vote) {
        counter++;
        this.idExam = counter;
        this.dateExam = dateExam;
        this.vote = vote;
    }

    public LocalDate getDateExam() {
        return dateExam;
    }

    public int getIdExam() {
        return idExam;
    }

    public int getVote() {
        return vote;
    }

    @Override
    public String toString() {
        return idExam + " " + vote;
    }
}



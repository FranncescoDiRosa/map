package it.unikey;

import java.util.*;

public class Studente {
    private int rollNum;
    private int socialSecurityNum;
    private String name;
    private String surname;
    private TreeMap<Corso, Esame> libretto;

    public Studente() {
    }

    public Studente(int rollNum, int socialSecurityNum, String name, String surname) {
        this.rollNum = rollNum;
        this.socialSecurityNum = socialSecurityNum;
        this.name = name;
        this.surname = surname;
        this.libretto = new TreeMap<>();
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public int getSocialSecurityNum() {
        return socialSecurityNum;
    }

    public void setSocialSecurityNum(int socialSecurityNum) {
        this.socialSecurityNum = socialSecurityNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public TreeMap<Corso, Esame> getLibretto() {
        return libretto;
    }

    public void aggiornaLibretto(Corso course, Esame esame) {
        this.libretto.put(course, esame);
    }

    public int mediaEsame() {
        int sommaVoto = 0;
        int numeroesami = 0;
        for (Esame e : libretto.values()) {
            sommaVoto += e.getGrade();
            numeroesami++;
        }
        return sommaVoto / numeroesami;
    }

}

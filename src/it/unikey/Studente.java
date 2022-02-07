package it.unikey;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class Studente {
    private int rollNum;
    private int socialSecurityNum;
    private String name;
    private String surname;
    private TreeMap<Corso,Esame> elencoCorsi;


    public Studente() { }

    public Studente(int rollNum, int socialSecurityNum, String name, String surname) {
        this.rollNum = rollNum;
        this.socialSecurityNum = socialSecurityNum;
        this.name = name;
        this.surname = surname;
        this.elencoCorsi = elencoCorsi;
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

    public TreeMap<Corso, Esame> getElencoCorsi() {
        return elencoCorsi;
    }

    public void setElencoCorsi(TreeMap<Corso, Esame> elencoCorsi) {
        this.elencoCorsi = elencoCorsi;
    }

    public static void insertStudent(List<Studente> listaStudenti, Studente studente){
        listaStudenti.add(studente);
    }
}

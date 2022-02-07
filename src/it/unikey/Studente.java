package it.unikey;

import it.unikey.exception.NotFoundException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static it.unikey.Main.mapStudenteCorso;

public class Studente {

    private int matricola;
    private String codiceFiscale;
    private String nome;
    private String cognome;
    private static int counter;

    public Studente(String codiceFiscale, String nome, String cognome) {
        counter ++;
        this.matricola = counter;
        this.codiceFiscale = codiceFiscale;
        this.nome = nome;
        this.cognome = cognome;
    }

    public void inserisciEsame(LocalDate dataEsame, String materia, int voto){
        try{
            Corso corso = trovaCorsoTramiteMateria(materia);
            Esame esame = new Esame(dataEsame, voto, corso);
            if (!studentePresenteNellHashMap()) {
                mapStudenteCorso.put(this.getMatricola(), new ArrayList<>(Arrays.asList()));
            } else {
                mapStudenteCorso.get(this.matricola).add(esame);
            }
        }
        catch(Exception e){
            throw new NotFoundException("Corso non trovato!");
        }
    }

    public boolean studentePresenteNellHashMap() {
        for (Integer stud : mapStudenteCorso.keySet()) {
            if(stud == this.matricola)
                return true;
        }
        return false;
    }

    public Corso trovaCorsoTramiteMateria(String materia){
        for(Corso corso : Università.corsi){
            if(corso.getMateria().equalsIgnoreCase(materia)){
                return corso;
            }
        }
        return null;
    }

    public void stampaEsamiStudente() {
        mapStudenteCorso.get(this.getMatricola()).forEach(System.out::println);
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Studente.counter = counter;
    }

}

package it.unikey.entities;

import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;

public class Studente implements Comparable<Studente> {

    private int matricola;
    private String codiceFiscale;
    private String nome;
    private String cognome;

    public Studente(String codiceFiscale, String nome, String cognome) {
        this.matricola = ThreadLocalRandom.current().nextInt(0, (int) Integer.MAX_VALUE);
        this.codiceFiscale = codiceFiscale;
        this.nome = nome;
        this.cognome = cognome;
    }

    public int getMatricola() {
        return matricola;
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

    @Override
    public String toString() {
        return "Studente [codiceFiscale=" + codiceFiscale + ", cognome=" + cognome + ", matricola=" + matricola
                + ", nome=" + nome + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Studente other = (Studente) obj;
        if (codiceFiscale == null) {
            if (other.codiceFiscale != null)
                return false;
        } else if (!codiceFiscale.equals(other.codiceFiscale))
            return false;
        if (cognome == null) {
            if (other.cognome != null)
                return false;
        } else if (!cognome.equals(other.cognome))
            return false;
        // if (matricola != other.matricola)
        // return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    @Override
    public int compareTo(Studente o) {
        return Comparator.comparing(Studente::getCognome).thenComparing(Studente::getNome)
                .thenComparing(Studente::getMatricola).compare(this, o);
    }

}

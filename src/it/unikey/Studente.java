package it.unikey;

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

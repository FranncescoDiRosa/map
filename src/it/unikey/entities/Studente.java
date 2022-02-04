package it.unikey.entities;

import it.unikey.exceptions.NullNameException;
import it.unikey.exceptions.NullSurnameException;

import java.util.Locale;

public class Studente
{
    private static int progressivoMatricola;

    private int matricola;
    private String codiceFiscale;
    private String nome;
    private String cognome;

    public Studente(String codiceFiscale, String nome, String cognome) throws Exception {
        setCodiceFiscale(codiceFiscale);
        setNome(nome);
        setCognome(cognome);
        progressivoMatricola++;
        setMatricola(progressivoMatricola);
    }

    public static int getProgressivoMatricola()
    {
        return progressivoMatricola;
    }

    public int getMatricola()
    {
        return matricola;
    }

    private void setMatricola(int matricola)
    {
        this.matricola = matricola;
    }

    public String getCodiceFiscale()
    {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) throws Exception
    {
        if(codiceFiscale == null)
            throw new Exception("Devi assegnare un codice fiscale allo studente!");

        if(codiceFiscale.length() != 16)
            throw new Exception("Il codice fiscale deve essere composto da 16 caratteri");

        this.codiceFiscale = codiceFiscale.toUpperCase();
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome == null)
            throw new NullNameException("Devi assegnare un nome allo studente!");

        this.nome = nome;
    }

    public String getCognome()
    {
        return cognome;
    }

    public void setCognome(String cognome) throws Exception {
        if(cognome == null)
            throw new NullSurnameException("Devi assegnare un cognome allo studente!");

        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return nome + " " + cognome + ", matricola: " + matricola;
    }
}

package it.unikey.entities;

import java.sql.Date;
import java.util.TreeMap;
import java.util.TreeSet;

public abstract class Universita {

    private static TreeSet<Studente> listaStudenti = new TreeSet<>();
    private static TreeSet<Corso> listaCorsi = new TreeSet<>();
    private static TreeMap<Corso, TreeSet<Studente>> listaStudentiCorsi = new TreeMap<>();

    private static TreeSet<Esame> listaEsami = new TreeSet<>();
    private static TreeMap<Esame, Studente> listaEsamiStudenti = new TreeMap<>();
    private static TreeMap<Esame, Corso> listaEsamiCorsi = new TreeMap<>();

    public static TreeSet<Studente> getListaStudenti() {
        return listaStudenti;
    }

    public static TreeSet<Corso> getListaCorsi() {
        return listaCorsi;
    }

    public static TreeMap<Corso, TreeSet<Studente>> getListaStudentiCorsi() {
        return listaStudentiCorsi;
    }

    public static TreeSet<Esame> getListaEsami() {
        return listaEsami;
    }

    public static TreeMap<Esame, Studente> getListaEsamiStudenti() {
        return listaEsamiStudenti;
    }

    public static TreeMap<Esame, Corso> getListaEsamiCorsi() {
        return listaEsamiCorsi;
    }

    public static void inserisciStudente(Studente studente) {
        if (!listaStudenti.contains(studente)) {
            listaStudenti.add(studente);
            System.out.println("\n" + studente.getNome() + " " + studente.getCognome()
                    + " e' stata/o aggiunta/o con successo alla lista degli studenti!");
        } else {
            System.out.println("\nErrore: " + studente.getNome() + " " + studente.getCognome()
                    + " e' gia' iscritta/o all'universita'");
        }
    }

    public static void inserisciCorso(Corso corso) {
        if (!listaCorsi.contains(corso)) {
            listaCorsi.add(corso);
            System.out.println("\n" + corso.getMateria() + " e' stato aggiunto con successo alla lista dei corsi!");
        } else {
            System.out.println(
                    "\nErrore: " + corso.getMateria() + " e' gia' registrato nella lista dei corsi universitari");
        }
    }

    public static TreeSet<Studente> getListaStudentiNelCorso(Corso corso) {
        if (listaStudentiCorsi.get(corso) == null)
            listaStudentiCorsi.put(corso, new TreeSet<Studente>());
        return listaStudentiCorsi.get(corso);
    }

    public static void inserisciStudenteNelCorso(Studente studente, Corso corso) {
        if (listaCorsi.contains(corso)) {
            if (listaStudenti.contains(studente)) {
                if (!getListaStudentiNelCorso(corso).contains(studente)) {
                    getListaStudentiNelCorso(corso).add(studente);
                    System.out.println("\n" + studente.getNome() + " " + studente.getCognome()
                            + " e' stato aggiunto con successo al corso " + corso.getMateria() + "!");
                } else
                    System.out.println("\nErrore: " + studente.getNome() + " " + studente.getCognome()
                            + " e' gia' iscritta/o al corso '" + corso.getMateria() + "'");
            } else
                System.out.println("\nErrore: non ho trovato " + studente.getNome() + " " + studente.getCognome()
                        + " nella lista degli studenti");

        } else
            System.out.println("\nErrore: Non ho trovato " + corso.getMateria() + " nella lista dei corsi");
    }

    public static void inserisciEsame(Esame esame, Studente studente, Corso corso) {
        if (listaCorsi.contains(corso)) {
            if (listaStudenti.contains(studente)) {
                if (getListaStudentiNelCorso(corso).contains(studente)) {
                    listaEsami.add(esame);
                    listaEsamiStudenti.put(esame, studente);
                    listaEsamiCorsi.put(esame, corso);
                    System.out.println("\nL'esame di " + corso.getMateria() + ", tenuto da " + studente.getNome() +
                            " " + studente.getCognome() + " in data " + esame.getDataEsame() + " con voto finale " +
                            esame.getVoto() + " e' stato aggiunto con successo alla lista degli esami!");
                } else
                    System.out.println("\nErrore: " + studente.getNome() + " " + studente.getCognome()
                            + " non e' iscritta/o al corso '" + corso.getMateria() + "'");
            } else
                System.out.println("\nErrore: non ho trovato " + studente.getNome() + " " + studente.getCognome()
                        + " nella lista degli studenti");
        } else
            System.out.println("\nErrore: Non ho trovato " + corso.getMateria() + " nella lista dei corsi");
    }

    public static float mediaEsamiStudente(Studente studente) {
        float sommaVotiEsami = 0;
        int numeroEsami = 0;
        for (Esame esame : listaEsamiStudenti.keySet()) {
            if (listaEsamiStudenti.get(esame).equals(studente)) {
                sommaVotiEsami += esame.getVoto();
                numeroEsami++;
            }
        }
        return sommaVotiEsami / numeroEsami;
    }

    public static TreeSet<Studente> getListaStudentiMediaEsamiMajX(int mediaMinima) {
        TreeSet<Studente> listaStudentiValidi = new TreeSet<>();
        for (Studente studente : listaEsamiStudenti.values()) {
            if (mediaEsamiStudente(studente) > mediaMinima)
                listaStudentiValidi.add(studente);
        }
        return listaStudentiValidi;
    }

    //RISOLVI PROBLEMA CON LA DATA!!!
    public static TreeSet<Esame> getListaEsamiCompresiXY(Date x, Date y) {
        TreeSet<Esame> listaEsamiValidi = new TreeSet<>();
        for(Esame esame : listaEsami) {
            if(esame.getDataEsame().after(x) && esame.getDataEsame().before(y))
                listaEsamiValidi.add(esame);
        }
        return listaEsamiValidi;
    }

}

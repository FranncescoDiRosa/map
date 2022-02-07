package it.unikey.entities;

import java.sql.Date;
import java.util.TreeMap;
import java.util.TreeSet;

public abstract class Universita {

    private static TreeSet<Corso> listaCorsi = new TreeSet<>();
    private static TreeSet<Studente> listaStudenti = new TreeSet<>();

    private static TreeMap<Corso, TreeMap<Studente, TreeSet<Esame>>> listaEsami = new TreeMap<>();

    public static TreeSet<Studente> getListaStudenti() {
        return listaStudenti;
    }

    public static TreeSet<Corso> getListaCorsi() {
        return listaCorsi;
    }

    public static TreeMap<Corso, TreeMap<Studente, TreeSet<Esame>>> getListaEsami() {
        return listaEsami;
    }

    public static TreeMap<Studente, TreeSet<Esame>> getListaStudentiCorso(Corso corso) {
        if (listaEsami.get(corso) == null)
            listaEsami.put(corso, new TreeMap<Studente, TreeSet<Esame>>());
        return listaEsami.get(corso);
    }

    public static TreeSet<Esame> getListaEsamiStudente(Corso corso, Studente studente) {
        if (listaEsami.get(corso).get(studente) == null)
            listaEsami.get(corso).put(studente, new TreeSet<Esame>());
        return listaEsami.get(corso).get(studente);
    }

    // 1 - Inserisci studente
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

    // 2 - Inserisci corso
    public static void inserisciCorso(Corso corso) {
        if (!listaCorsi.contains(corso)) {
            listaCorsi.add(corso);
            System.out.println("\n" + corso.getMateria() + " e' stato aggiunto con successo alla lista dei corsi!");
        } else {
            System.out.println(
                    "\nErrore: " + corso.getMateria() + " e' gia' registrato nella lista dei corsi universitari");
        }
    }

    // 3 - Inserisci esame
    public static void inserisciEsame(Esame esame, Studente studente, Corso corso) {
        if (listaCorsi.contains(corso) && (!listaEsami.containsKey(corso))) {
            listaEsami.put(corso, new TreeMap<Studente, TreeSet<Esame>>());
            if (listaStudenti.contains(studente)) {
                listaEsami.get(corso).put(studente, new TreeSet<Esame>());
                listaEsami.get(corso).get(studente).add(esame);
                System.out.println("\nL'esame di " + studente.getNome() + " " + studente.getCognome() + " in "
                        + corso.getMateria() + " e' stato verbalizzato correttamente!");
            } else {
                System.out.println("Errore: lo studente specificato non e' nella lista degli studenti");
            }
        } else if (listaCorsi.contains(corso) && (listaEsami.containsKey(corso))) {
            if (listaStudenti.contains(studente) && (!listaEsami.get(corso).containsKey(studente))) {
                listaEsami.get(corso).put(studente, new TreeSet<Esame>());
                listaEsami.get(corso).get(studente).add(esame);
                System.out.println("\nL'esame di " + studente.getNome() + " " + studente.getCognome() + " in "
                        + corso.getMateria() + " e' stato verbalizzato correttamente!");
            } else if (listaStudenti.contains(studente) && listaEsami.get(corso).containsKey(studente)) {
                if (!listaEsami.get(corso).get(studente).contains(esame)) {
                    listaEsami.get(corso).get(studente).add(esame);
                    System.out.println("\nL'esame di " + studente.getNome() + " " + studente.getCognome() + " in "
                            + corso.getMateria() + " e' stato verbalizzato correttamente!");
                } else {
                    System.out.println("Errore: e' gia' stato verbalizzato un esame di " + studente.getNome() + " "
                            + studente.getCognome() + " in " + corso.getMateria() + " per la stessa data!");
                }
            } else {
                System.out
                        .println("Errore: lo studente specificato non e' presente nel corso specificato, aggiungilo!");
            }
        }
        else {
            System.out.println(
                    "Errore: il corso specificato non e' presente nella lista dei corsi universitari, aggiungilo!");
        }
    }

    // 4 - Media esami studente
    public static float mediaEsamiStudente(Studente studente) {
        float mediaEsamiStudente = 0;
        int nEsamiStudente = 0;
        for (Corso corso : listaEsami.keySet()) {
            if (listaEsami.get(corso).containsKey(studente)) {
                for (Esame esame : listaEsami.get(corso).get(studente)) {
                    nEsamiStudente++;
                    mediaEsamiStudente += esame.getVoto();
                }
            }
        }
        return mediaEsamiStudente / nEsamiStudente;
    }

    // 5 - ricercare tutti gli esami sostenuti tra data X e data Y
    public static TreeSet<Esame> listaEsamiTraDataXY(Date x, Date y) {
        TreeSet<Esame> listaEsamiValidi = new TreeSet<>();
        for(Corso corso : listaEsami.keySet()) {
            for(Studente studente : listaEsami.get(corso).keySet()) {
                for(Esame esame : listaEsami.get(corso).get(studente)) {
                    if(esame.getDataEsame().after(x) && esame.getDataEsame().before(y))
                        listaEsamiValidi.add(esame);
                }
            }
        }
        return listaEsamiValidi;
    }


    // 6 - ricercare tutti gli studenti che hanno media esami > X
    public static TreeSet<Studente> listaStudentiMediaEsamiSupX(float mediaEsamiMinima) {
        TreeSet<Studente> listaStudentiValidi = new TreeSet<>();
        for(Studente studente : listaStudenti) {
            if(mediaEsamiStudente(studente) > mediaEsamiMinima)
                listaStudentiValidi.add(studente);
        }
        if(listaStudentiValidi.size() == 0)
            System.out.println("Non ho trovato studenti con una media superiore a " + mediaEsamiMinima);
        return listaStudentiValidi;
    }
}

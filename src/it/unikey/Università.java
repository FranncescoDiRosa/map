package it.unikey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static it.unikey.Main.mapStudenteCorso;

public class Università {

    public static List<Studente> studenti = new ArrayList<>(
            Arrays.asList(
                    new Studente("fb", "Fulvio", "Berretta"),
                    new Studente("ap", "Alessio", "Paolucci"),
                    new Studente("yd", "Yanik", "Dimitrov")
            )
    );

    public static List<Corso> corsi = new ArrayList<>(
            Arrays.asList(
            new Corso("Java", "Francesco Di Rosa", 6),
            new Corso("Python", "Sara Gaudiosi", 6)
            )
    );

    public static void inserisciStudente(Studente studente){
           studenti.add(studente);
    }

    public static void stampaStudenti(){
        System.out.println("Stampo nome e matricola degli studenti:");
       for(Studente st : studenti) { //for each: a destra spefico la lista su cui voglio iterare (studenti) e a sx il tipo di dato presente nella lista e st è il nome che rappresenta il singolo elemento (variabile appoggio)
           System.out.println(st.getNome() + " " + st.getMatricola());
       }
    }

    public static void inserisciCorso(Corso corso){
        corsi.add(corso);
    }









}


package it.unikey.controller;

import com.sun.org.apache.xpath.internal.operations.Variable;

import it.unikey.entities.Corso;
import it.unikey.entities.Studente;

import java.net.CacheRequest;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        Corso c = new Corso("chimica organica 2", "lucio pellacani", 9);
        Corso d = new Corso("istituzioni di matematica 1", "ada ardito", 6);
        Corso e = new Corso("chimica fisica 1", "victor malus", 6);
        Corso f = new Corso("fisica 2", "mario rossi", 9);

        Studente g = new Studente("1234567890123457", "Davide", "Piecek");
        Studente h = new Studente("1234567890123458", "Sandro", "Pertini");
        Studente i = new Studente("1234567890123459", "Toto", "Riina");
        Studente j = new Studente("1234567890123450", "Giuseppe", "Garibaldi");
        Studente k = new Studente("1234567890123451", "Karol", "Wojtila");
        Studente l = new Studente("1234567890123452", "Maria", "Di Nazaret");


    }
}

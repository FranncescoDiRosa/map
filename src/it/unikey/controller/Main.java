package it.unikey.controller;

import com.sun.org.apache.xpath.internal.operations.Variable;

import it.unikey.entities.Corso;
import it.unikey.entities.Esame;
import it.unikey.entities.Studente;

import java.net.CacheRequest;
import java.sql.Date;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) throws Exception {
        Corso c = new Corso("chimica organica 2", "lucio pellacani", 9);
        Corso d = new Corso("istituzioni di matematica 1", "ada ardito", 6);
        Corso e = new Corso("chimica fisica 1", "victor malus", 6);
        Corso f = new Corso("fisica 2", "mario rossi", 9);

        Studente g = new Studente("1234567890123457", "Davide", "Piecek");
        Studente h = new Studente("1234567890123458", "Sandro", "Pertini");
        Studente i = new Studente("1234567890123459", "Totò", "Sapore");
        Studente j = new Studente("1234567890123450", "Giuseppe", "Garibaldi");
        Studente k = new Studente("1234567890123451", "Karol", "Wojtila");
        Studente l = new Studente("1234567890123452", "Maria", "Di Nazaret");

        Esame m = new Esame(new Date(2022, 1, 5), 18, false, g, c);
        Esame n = new Esame(new Date(2021, 12, 12), 30, true , g, d);
        Esame o = new Esame(new Date(2022, 2, 1), 29, false, h, e);
        Esame p = new Esame(new Date(2022, 1, 15), 19, false , i, f);
        Esame q = new Esame(new Date(2021, 11, 30) , 24, false, j, e);
        Esame r = new Esame(new Date(2022, 1, 23), 30, true, k, e);
        Esame s = new Esame(new Date(2022, 1, 5), 18, false, l, c);

        System.out.println(Esame.getAvgVote(g));
        System.out.println(Esame.studentiAvgMaggioreDiN(20));
        System.out.println(Esame.esamiTraDueDate(new Date(2021, 01, 01), new Date(2022, 03, 01)));
    }
}

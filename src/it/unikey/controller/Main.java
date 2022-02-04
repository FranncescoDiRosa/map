package it.unikey.controller;

import com.sun.org.apache.xpath.internal.operations.Variable;
import it.unikey.entities.Corso;
import it.unikey.entities.Studente;

public class Main {

    public static void main(String[] args)
    {
        Corso c = new Corso("chimica organica 2", "lucio pellacani", 9);

        System.out.println(c.getCodice());
    }
}

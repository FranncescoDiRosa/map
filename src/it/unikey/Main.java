package it.unikey;

import java.text.DateFormat;
import java.util.*;

public class Main {

    public static List<Studente> elencoStudenti = new LinkedList<>();

    public static Set<Esame> esamiNellIntervallo(Set<Esame> listaEsami, Date data1, Date data2) {
        Set<Esame> esamiNellintervallo = new HashSet<>();
        for (Esame e : listaEsami) {
            if (e.getDate().compareTo(data1) > 0 && e.getDate().compareTo(data2) < 0) {
                esamiNellintervallo.add(e);
            }
        }
        return esamiNellintervallo;
    }

    public static void searchByMean(int n) {
        for (Studente s : elencoStudenti) {
            if (s.mediaEsame() > n) {
                System.out.println(s.getName());
            }
        }
    }

    public static void main(String[] args) {

        Studente radu = new Studente(1, 112233, "Radu", "Jataru");
        Studente alessio = new Studente(2, 223344, "Alessio", "Paolucci");
        Studente yanik = new Studente(3, 334455, "Yanik", "Dimitrov");
        Studente fulvio = new Studente(4, 445566, "Fulvio", "Berretta");

        elencoStudenti.add(radu);
        elencoStudenti.add(alessio);
        elencoStudenti.add(yanik);
        elencoStudenti.add(fulvio);

        Corso java = new Corso("J01", "Java", "DiRosa", 10);
        Corso javaScript = new Corso("JS01", "javaScript", "Frontelli", 8);

        Esame raduJava = new Esame(11, "2022-02-07", 27, false);
        Esame raduJScript = new Esame(111, "2022-01-01", 30, true);
        Esame alessioJava = new Esame(22, "2022-01-23", 28, false);
        Esame yanikJava = new Esame(33, "2020-05-26", 29, false);
        Esame yanikJScript = new Esame(222, "2021-04-30", 30, false);
        Esame fulvioJScript = new Esame(333, "2021-03-31", 30, true);

        radu.aggiornaLibretto(java, raduJava);
        radu.aggiornaLibretto(javaScript, raduJScript);
        alessio.aggiornaLibretto(java, alessioJava);
        yanik.aggiornaLibretto(java, yanikJava);
        yanik.aggiornaLibretto(javaScript, yanikJScript);
        fulvio.aggiornaLibretto(java, fulvioJScript);


    }
}

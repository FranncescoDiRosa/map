package it.unikey;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

           /*  1) inserimento studente
        2) inserimento corso
        3) inserimento esame (ricercare studente e corso)
        4) calcola media esami di uno studente
        5) ricercare tutti gli esami sostenuti tra data X e data Y
        6) ricercare tutti gli studenti che hanno media esami > X   */

    public static void main(String[] args) {


        Studente fulvio = new Studente("fb", "Fulvio", "Berretta");
        Studente alessio = new Studente("ap", "Alessio", "Paolucci");
        Studente yanik = new Studente("yd", "Yanik", "Dimitrov");

        Corso java = new Corso("Java", "Francesco Di Rosa", 6);
        Corso python = new Corso("Python", "Sara Gaudiosi", 6);

        Esame elementiJava = new Esame(Date.valueOf("02-01-2019") , 25, false, java);


    }

    public  static List<Studente> studenti = new ArrayList<>();
    public  static List<Corso> corsi = new ArrayList<>();
    public  static List<Esame> esami = new ArrayList<>();
    public static Map<Studente, List<Esame>> mapStudenteCorso = new HashMap<>();

    public static void inserimentoStudente(Studente students){
        studenti.add(students);
    }

    public static void inserimentoCorso(Corso corso){
        corsi.add(corso);
    }

    public static void inserimentoEsame(int idEsame, int matricola){
        Studente studente = trovaStudenteTramiteId(matricola);
        Esame esame = trovaEsameTramiteId(idEsame);

        List<Esame> esamiDelloStudente = new ArrayList<>();
        esamiDelloStudente.add(esame);
        mapStudenteCorso.put(studente, esamiDelloStudente);
            //per poter aggiungere ulteriori esami dello studente, noi dobbiamo
        //accedere tramite la chiave alla Lista di esami dello stesso,
        //e poter aggiungere un ulteriore nuovo esame a questa suddetta lista
        if()

    }

    //TODO: vereificare null
    public static Esame trovaEsameTramiteId(int id) {
        for (Esame es: esami) {   //cicla tutti gli esami (es variabile temporanea che viene ciclata all'interno della lista esami)
            if (es.getIdEsame() == id)  //se id dato è uguale a uno che è presenta nella lista, ritorna quell'esame
                return es;
        }
        return null;
    }

    public static Studente trovaStudenteTramiteId(int matricola) {
        for (Studente st: studenti) {
            if (st.getMatricola() == matricola)
                return st;
        }
        return null;
    }


}

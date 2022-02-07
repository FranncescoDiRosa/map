package it.unikey;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static it.unikey.Università.inserisciStudente;
import static it.unikey.Università.stampaStudenti;

public class Main {

           /*  1) inserimento studente
        2) inserimento corso
        3) inserimento esame (ricercare studente e corso)
        4) calcola media esami di uno studente
        5) ricercare tutti gli esami sostenuti tra data X e data Y
        6) ricercare tutti gli studenti che hanno media esami > X   */

    public static Map<Integer, List<Esame>> mapStudenteCorso = new HashMap<>();

    public static void main(String[] args) {

        Studente francesco = new Studente("fr", "Francesco", "Verdi");
        inserisciStudente(francesco);
        stampaStudenti();
        francesco.inserisciEsame(LocalDate.parse("2020-02-25"), "Java", 25);
        francesco.inserisciEsame(LocalDate.parse("2020-04-20"), "Python", 26);
        francesco.stampaEsamiStudente();


    }




//    public static void inserimentoEsame(int idEsame, int matricola){
//        Studente studente = trovaStudenteTramiteId(matricola);
//        Esame esame = trovaEsameTramiteId(idEsame);
//        List<Esame> esamiDelloStudente = new ArrayList<>();
//        esamiDelloStudente.add(esame);
//        mapStudenteCorso.put(studente.getMatricola(), esamiDelloStudente);
//        //per poter aggiungere ulteriori esami dello studente, noi dobbiamo
//        //accedere tramite la chiave alla Lista di esami dello stesso,
//        //e poter aggiungere un ulteriore nuovo esame a questa suddetta lista
//        if()
//
//    }

//    //TODO: vereificare null
//    public static Esame trovaEsameTramiteId(int id) {
//        for (Esame es: esami) {   //cicla tutti gli esami (es variabile temporanea che viene ciclata all'interno della lista esami)
//            if (es.getIdEsame() == id)  //se id dato è uguale a uno che è presenta nella lista, ritorna quell'esame
//                return es;
//        }
//        return null;
//    }
//
//    public static Studente trovaStudenteTramiteId(int matricola) {
//        for (Studente st: studenti) {
//            if (st.getMatricola() == matricola)
//                return st;
//        }
//        return null;
    }




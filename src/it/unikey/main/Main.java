package it.unikey.main;

import java.sql.Date;

import it.unikey.entities.Corso;
import it.unikey.entities.Esame;
import it.unikey.entities.Studente;
import it.unikey.entities.Universita;

public class Main {

    public static void main(String[] args) {

        
        Studente edoardo = new Studente("CRRDRD96P08B114A", "Edoardo", "Carradori");
        /*
        Studente giraud = new Studente("3589893300183572", "Giraud", "Gasticke");
        Studente rudiger = new Studente("374288161403224", "Rudiger", "Crewes");
        */

        Corso java = new Corso("Java", "Sara&Francesco", 9);
        
        Corso trippeldex = new Corso("Trippledex", "Geri Windley", 6);
        Corso yfind = new Corso("Y-find", "Cary Bach", 6);
        Corso otcom = new Corso("Otcom", "Hilario De Pinna", 12);
        Corso ventosanzap = new Corso("Ventosanzap", "Modesta Timlett", 3);
        Corso rank = new Corso("Rank", "Dominica Blackborn", 18);
        Corso zontrax = new Corso("Zontrax", "Lilas Tilne", 9);
        
        
        Esame esameJava = new Esame("2022-02-05", 20, false);
        
        Esame esameTrippeldex = new Esame("2021-07-25", 23, false);
        Esame esameYfind = new Esame("2021-11-16", 28, false);
        Esame esameOtcom = new Esame("2019-07-20", 24, false);
        Esame esameVentosanzap = new Esame("2020-02-16", 18, false);
        Esame esameRank = new Esame("2019-09-27", 23, false);
        Esame esameZontrax = new Esame("2021-06-04", 20, false);
        


        
        //1 - Inserimento studenti
        Universita.inserisciStudente(edoardo);
        //Universita.inserisciStudente(edoardo);
        //Universita.inserisciStudente(giraud);
        //Universita.inserisciStudente(rudiger);
        //Universita.inserisciStudente(rudiger);
        //Universita.inserisciStudente(rudiger);
        //Universita.getListaStudenti().forEach(System.out::println);



        //2 - inserimento corso
        Universita.inserisciCorso(java);
        
        Universita.inserisciCorso(trippeldex);
        Universita.inserisciCorso(trippeldex);
        Universita.inserisciCorso(otcom);
        Universita.inserisciCorso(yfind);
        //Universita.inserisciCorso(yfind);
        Universita.inserisciCorso(rank);
        //Universita.inserisciCorso(rank);
        //Universita.inserisciCorso(rank);
        Universita.inserisciCorso(ventosanzap);
        //Universita.inserisciCorso(ventosanzap);
        Universita.inserisciCorso(zontrax);
        //Universita.getListaCorsi().forEach(System.out::println);
        



        //3 - inserimento esame (con studente)
        
        Universita.inserisciEsame(esameJava, edoardo, java);
        
        Universita.inserisciEsame(esameTrippeldex, edoardo, trippeldex);
        Universita.inserisciEsame(esameTrippeldex, edoardo, trippeldex);
        Universita.inserisciEsame(esameYfind, edoardo, yfind);
        Universita.inserisciEsame(esameOtcom, edoardo, otcom);
        Universita.inserisciEsame(esameVentosanzap, edoardo, ventosanzap);
        Universita.inserisciEsame(esameRank, edoardo, rank);
        Universita.inserisciEsame(esameZontrax, edoardo, zontrax);

        /*
        Universita.inserisciEsame(esameYfind, giraud, yfind);
        Universita.inserisciEsame(esameOtcom, giraud, otcom);
        Universita.inserisciEsame(esameVentosanzap, giraud, ventosanzap);

        Universita.inserisciEsame(esameYfind, rudiger, yfind);
        Universita.inserisciEsame(esameOtcom, rudiger, otcom);
        Universita.inserisciEsame(esameVentosanzap, rudiger, ventosanzap);
        Universita.inserisciEsame(esameRank, rudiger, rank);
        Universita.inserisciEsame(esameZontrax, rudiger, zontrax);
        */



        //4 - calcola media esami di uno studente
    
        System.out.println("\n" + Universita.mediaEsamiStudente(edoardo));

        /*
        System.out.println("\n" + Universita.mediaEsamiStudente(giraud));
        System.out.println("\n" + Universita.mediaEsamiStudente(rudiger) + "\n");
        */

        //5 - ricercare tutti gli esami sostenuti tra data X e data Y
        
        Universita.listaEsamiTraDataXY((Date.valueOf("2020-05-23")), (Date.valueOf("2022-02-05"))).forEach(System.out::println);
        System.out.println();
        


        //6 - ricercare tutti gli studenti che hanno media esami > X
        
        Universita.listaStudentiMediaEsamiSupX(23).forEach(System.out::println);
        
        
    }
}

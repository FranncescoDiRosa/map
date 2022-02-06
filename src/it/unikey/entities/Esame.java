package it.unikey.entities;

import org.omg.CORBA.WStringSeqHelper;

import java.util.*;

public class Esame
{
    private static Map<Studente, Map<Corso, Esame>> mappaStudenti = new HashMap();

    private String codice;
    private Calendar dataEsame;
    private int voto;
    private boolean lode;

    public Esame(Calendar dataEsame, int voto, boolean lode, Studente studente, Corso corso)
    {
        this.dataEsame = dataEsame;
        this.voto = voto;
        this.lode = lode;
        this.codice = generaCodiceEsame(studente, corso, dataEsame);
        if(mappaStudenti.get(studente) == null)
        {
            Map<Corso, Esame> mappaCorso = new HashMap<>();
            mappaCorso.put(corso, this);
            mappaStudenti.put(studente, mappaCorso);
        }
        else
            mappaStudenti.get(studente).put(corso, this);

    }

    private String generaCodiceEsame(Studente s, Corso corso, Calendar dataEsame)
    {
        return s.getMatricola()+"_"+corso.getCodice()+"_"+dataEsame.toString();
    }

    public String getCodice() {
        return codice;
    }

    public Calendar getDataEsame() {
        return dataEsame;
    }

    public int getVoto() {
        return voto;
    }

    public boolean isLode() {
        return lode;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj ==  null)
            return false;
        if(obj == this)
            return true;
        if(obj instanceof Esame)
        {
            Esame e = (Esame) obj;
            return this.codice.equals(e.codice);
        }
        return false;
    }

    public static double getAvgVote(Studente studente)
    {
        int count = 0;
        int sum = 0;
        Collection<Esame> esami =  mappaStudenti.get(studente).values();
        for(Esame e : esami)
        {
            sum += e.voto;
            count++;
        }
        return sum / count;
    }

    public static ArrayList<Studente> studentiAvgMaggioreDiN(int avg)
    {
        ArrayList<Studente> res = new ArrayList<>();
        return res;
    }
}

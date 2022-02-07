package it.unikey.entities;

import org.omg.CORBA.WStringSeqHelper;

import java.sql.Date;
import java.util.*;

public class Esame
{
    private static Map<Studente, Map<Corso, Esame>> mappaStudenti = new HashMap();

    private String codice;
    private Date dataEsame;
    private int voto;
    private boolean lode;

    public Esame(Date dataEsame, int voto, boolean lode, Studente studente, Corso corso)
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

    private String generaCodiceEsame(Studente s, Corso corso, Date dataEsame)
    {
        return s.getMatricola()+"_"+corso.getCodice()+"_"+dataEsame.toString();
    }

    public String getCodice() {
        return codice;
    }

    public Date getDataEsame() {
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
        Set<Studente> stud = mappaStudenti.keySet();
        for(Studente s : stud)
            if(getAvgVote(s) > avg)
                res.add(s);
        return res;
    }

    public static ArrayList<String> esamiTraDueDate (Date from, Date to)
    {
        ArrayList<String> res = new ArrayList<>();
        Collection<Map<Corso, Esame>> map = mappaStudenti.values();
        for(Map<Corso, Esame> m: map)
        {
            Collection<Esame> es = m.values();
            for(Esame e: es)
                if(e.dataEsame.compareTo(from) >= 0 && e.dataEsame.compareTo(to) <= 0)
                    res.add(e.codice);
        }
        return res;
    }

}

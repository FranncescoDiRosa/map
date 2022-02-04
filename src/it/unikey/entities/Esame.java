package it.unikey.entities;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Esame
{
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
}

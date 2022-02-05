package it.unikey.entities;

import java.util.Comparator;
import java.util.UUID;
import java.sql.Date;

public class Esame implements Comparable<Esame> {

    private String codiceEsame;
    private Date dataEsame;
    private int voto;
    private boolean lode;

    public Esame(String dataEsame, int voto, boolean lode) {
        this.codiceEsame = UUID.randomUUID().toString();
        this.dataEsame = Date.valueOf(dataEsame);
        this.voto = voto;
        this.lode = lode;
    }

    public String getCodiceEsame() {
        return codiceEsame;
    }

    public Date getDataEsame() {
        return dataEsame;
    }

    public void setDataEsame(Date dataEsame) {
        this.dataEsame = dataEsame;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public boolean isLode() {
        return lode;
    }

    public void setLode(boolean lode) {
        this.lode = lode;
    }

    

    @Override
    public String toString() {
        return "Esame [codiceEsame=" + codiceEsame + ", dataEsame=" + dataEsame + ", lode=" + lode + ", voto=" + voto
                + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Esame other = (Esame) obj;
        if (codiceEsame == null) {
            if (other.codiceEsame != null)
                return false;
        } else if (!codiceEsame.equals(other.codiceEsame))
            return false;
        if (dataEsame == null) {
            if (other.dataEsame != null)
                return false;
        } else if (!dataEsame.equals(other.dataEsame))
            return false;
        if (lode != other.lode)
            return false;
        if (voto != other.voto)
            return false;
        return true;
    }

    @Override
    public int compareTo(Esame o) {
        return Comparator.comparing(Esame::getDataEsame).thenComparing(Esame::getVoto).compare(this, o);
    }

}

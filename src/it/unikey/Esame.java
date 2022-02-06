package it.unikey;

import java.util.Date;

public class Esame {

    private Date dataEsame;
    private int voto;
    private boolean lode;
    private Corso corso;
    private int counter;
    private int idEsame;

    public Esame(Date dataEsame, int voto, boolean lode, Corso corso) {
        counter++;
        this.idEsame = counter;
        this.dataEsame = dataEsame;
        this.voto = voto;
        this.lode = lode;
        this.corso = corso;
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

    public Corso getCorso() {
        return corso;
    }

    public void setCorso(Corso corso) {
        this.corso = corso;
    }

    public int getIdEsame() {
        return idEsame;
    }

    public void setIdEsame(int idEsame) {
        this.idEsame = idEsame;
    }

}

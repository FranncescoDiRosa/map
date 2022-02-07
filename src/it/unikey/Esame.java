package it.unikey;

import java.time.LocalDate;
import java.util.Date;

public class Esame {

    private LocalDate dataEsame;
    private int voto;
    private boolean lode;
    private Corso corso;
    private int counter;
    private int idEsame;

    public Esame(LocalDate dataEsame, int voto, Corso corso) {
        counter++;
        this.idEsame = counter;
        this.dataEsame = dataEsame;
        this.voto = voto;
        this.corso = corso;
    }

    public LocalDate getDataEsame() {
        return dataEsame;
    }

    public void setDataEsame(LocalDate dataEsame) {
        this.dataEsame = dataEsame;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
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

    @Override
    public String toString() {
        return "Esame{" +
                "dataEsame=" + dataEsame +
                ", voto=" + voto +
                ", lode=" + lode +
                ", corso=" + corso +
                ", counter=" + counter +
                ", idEsame=" + idEsame +
                '}';
    }
}

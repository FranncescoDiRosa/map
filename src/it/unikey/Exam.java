package it.unikey;

import java.time.LocalDate;

public class Exam {

    private LocalDate dataEsame;
    private int voto;
    private boolean lode;
    private Course corso;
    private int counter;
    private int idEsame;

    public Exam(LocalDate dataEsame, int voto, Course corso) {
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

    public Course getCorso() {
        return corso;
    }

    public void setCorso(Course corso) {
        this.corso = corso;
    }

    public int getIdEsame() {
        return idEsame;
    }

    public void setIdEsame(int idEsame) {
        this.idEsame = idEsame;
    }


}

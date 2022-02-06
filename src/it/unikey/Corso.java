package it.unikey;


public class Corso {

    private int counter;
    private String codice;
    private String materia;
    private String docente;
    private int cfu;
    //private Esame esame;

    public Corso(String materia, String docente, int cfu) {
        counter++;
        this.codice = counter + "";
        this.materia = materia;
        this.docente = docente;
        this.cfu = cfu;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public int getCfu() {
        return cfu;
    }

    public void setCfu(int cfu) {
        this.cfu = cfu;
    }

}

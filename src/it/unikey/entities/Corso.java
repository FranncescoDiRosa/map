package it.unikey.entities;

public class Corso
{
    private static int progressivoCodice;

    private String codice;
    private String materia;
    private String docente;
    private int cfu;

    public Corso(String materia, String docente, int cfu)
    {
        this.materia = materia;
        this.docente = docente;
        this.cfu = cfu;
        this.codice = codeGenerator();
    }

    private String codeGenerator()
    {
        String res = "" + this.cfu;
        String[] m = this.materia.split(" ");
        for(String s : m)
        {
            res += s.substring(0, 1).toUpperCase();
        }
        progressivoCodice++;
        res += progressivoCodice;
        return res;
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

    @Override
    public String toString() {
        return this.materia;
    }
}

package it.unikey.entities;

import java.util.Comparator;
import java.util.UUID;

public class Corso implements Comparable<Corso> {

    private String codiceCorso;
    private String materia;
    private String docente;
    private int cfu;

    public Corso(String materia, String docente, int cfu) {
        this.codiceCorso = UUID.randomUUID().toString();
        this.materia = materia;
        this.docente = docente;
        this.cfu = cfu;
    }

    public String getCodiceCorso() {
        return codiceCorso;
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
        return "Corso [cfu=" + cfu + ", codiceCorso;=" + codiceCorso + ", docente=" + docente + ", materia=" + materia + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Corso other = (Corso) obj;
        if (cfu != other.cfu)
            return false;
        //if (codiceCorso; == null) {
        //    if (other.codiceCorso; != null)
        //        return false;
        //} else if (!codiceCorso;.equals(other.codiceCorso;))
        //    return false;
        if (docente == null) {
            if (other.docente != null)
                return false;
        } else if (!docente.equals(other.docente))
            return false;
        if (materia == null) {
            if (other.materia != null)
                return false;
        } else if (!materia.equals(other.materia))
            return false;
        return true;
    }

    @Override
    public int compareTo(Corso o) {
        return Comparator.comparing(Corso::getMateria).thenComparing(Corso::getDocente).compare(this, o);
    }

    

}

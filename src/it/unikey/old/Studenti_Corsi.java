package it.unikey.old;

public class Studenti_Corsi {

    private int matricola;
    private String codiceCorso;

    public Studenti_Corsi(int matricola, String codiceCorso) {
        this.matricola = matricola;
        this.codiceCorso = codiceCorso;
    }

    public int getMatricola() {
        return matricola;
    }

    public String getCodiceCorso() {
        return codiceCorso;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Studenti_Corsi other = (Studenti_Corsi) obj;
        if (codiceCorso == null) {
            if (other.codiceCorso != null)
                return false;
        } else if (!codiceCorso.equals(other.codiceCorso))
            return false;
        if (matricola != other.matricola)
            return false;
        return true;
    }

    
}

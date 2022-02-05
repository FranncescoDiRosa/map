package it.unikey.old;

public class Studenti_Esami {

    private int matricola;
    private String codiceEsame;

    public Studenti_Esami(int matricola, String codiceEsame) {
        this.matricola = matricola;
        this.codiceEsame = codiceEsame;
    }

    public int getMatricola() {
        return matricola;
    }

    public String getCodiceEsame() {
        return codiceEsame;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Studenti_Esami other = (Studenti_Esami) obj;
        if (codiceEsame == null) {
            if (other.codiceEsame != null)
                return false;
        } else if (!codiceEsame.equals(other.codiceEsame))
            return false;
        if (matricola != other.matricola)
            return false;
        return true;
    }

}

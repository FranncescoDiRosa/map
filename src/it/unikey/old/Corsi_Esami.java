package it.unikey.old;

public class Corsi_Esami {

    private String codiceCorso;
    private String codiceEsame;

    public Corsi_Esami(String codiceCorso, String codiceEsame) {
        this.codiceCorso = codiceCorso;
        this.codiceEsame = codiceEsame;
    }

    public String getCodiceCorso() {
        return codiceCorso;
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
        Corsi_Esami other = (Corsi_Esami) obj;
        if (codiceCorso == null) {
            if (other.codiceCorso != null)
                return false;
        } else if (!codiceCorso.equals(other.codiceCorso))
            return false;
        if (codiceEsame == null) {
            if (other.codiceEsame != null)
                return false;
        } else if (!codiceEsame.equals(other.codiceEsame))
            return false;
        return true;
    }

}

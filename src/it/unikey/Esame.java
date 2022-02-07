package it.unikey;

import java.sql.Date;

;

public class Esame {
    private int codice;
    private Date date;
    private int grade;
    private boolean laude;

    public Esame() {
    }

    public Esame(int codice, String date, int grade, boolean laude) {
        this.codice = codice;
        this.date = Date.valueOf(date);
        this.grade = grade;
        this.laude = laude;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public Date getDate() {
        return date;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isLaude() {
        return laude;
    }

    public void setLaude(boolean laude) {
        this.laude = laude;
    }


}

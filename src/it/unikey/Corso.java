package it.unikey;

import java.util.List;

public class Corso {
    private String serialNum;
    private String subject;
    private String teacher;
    private Esame esame;//deve essere inteso come oggetto unico
    private int cfu;

    public Corso() { }

    public Corso(String serialNum, String subject, String teacher, Esame esame, int cfu) {
        this.serialNum = serialNum;
        this.subject = subject;
        this.teacher = teacher;
        this.esame = esame;
        this.cfu = cfu;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Esame getEsame() {
        return esame;
    }

    public void setEsame(Esame esame) {
        this.esame = esame;
    }

    public int getCfu() {
        return cfu;
    }

    public void setCfu(int cfu) {
        this.cfu = cfu;
    }

    public void insertCourse(List<Corso> listaCorsi,Corso corso){
        listaCorsi.add(corso);
    }


}

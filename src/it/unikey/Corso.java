package it.unikey;

import java.util.List;

public class Corso implements Comparable<Corso> {
    private String serialNum;
    private String subject;
    private String teacher;
    private int cfu;

    public Corso() {
    }

    public Corso(String serialNum, String subject, String teacher, int cfu) {
        this.serialNum = serialNum;
        this.subject = subject;
        this.teacher = teacher;
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

    public int getCfu() {
        return cfu;
    }

    public void setCfu(int cfu) {
        this.cfu = cfu;
    }


    //il comparator deve essere inserito all'interno della classe che contiene il campo che utilizzo come
    //metro di paragone, in questo caso corso per la mappa corso esame

    @Override
    public int compareTo(Corso o) {
        return serialNum.compareTo(o.serialNum);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

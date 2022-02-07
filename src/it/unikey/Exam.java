package it.unikey;

import java.util.Date;

public class Exam {

    private Date examDate;
    private int score;
    private boolean merit;

    Course course = new Course();

    public Exam() {
    }

    public Exam(Date examDate, int score, boolean merit) {
        this.examDate = examDate;
        this.score = score;
        this.merit = merit;
    }

    public Exam(Date examDate, Course course, int score, boolean merit) {
        this.examDate = examDate;
        this.score = score;
        this.merit = merit;
        this.course = course;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isMerit() {
        return merit;
    }

    public void setMerit(boolean merit) {
        this.merit = merit;
    }


}

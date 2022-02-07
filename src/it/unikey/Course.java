package it.unikey;

import java.util.*;
import java.util.stream.Collectors;

public class Course {

    private String code;
    private String matter;
    private String docent;
    private int cfu;
    private int counter;
    Exam exam;
    Student student;




    public Course(String matter) {
        counter++;
        this.code = counter + "";
        this.matter = matter;
    }


    public String getCode() {
        return code;
    }

    public String getMatter() {
        return matter;
    }

    public String getDocent() {
        return docent;
    }

    public int getCfu() {
        return cfu;
    }

    public void setCfu(int cfu) {
        this.cfu = cfu;
    }



}//end class





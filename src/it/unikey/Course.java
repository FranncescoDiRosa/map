package it.unikey;

public class Course {
    private String code;
    private String name;
    private String teacher;
    private int cfu;
    private static int counter = 0;

    public Course(String code, String name, String teacher, int cfu){
        this.code = code;
        this.name = name;
        this.teacher = teacher;
        this.cfu = cfu;

        University.coursesList.put(counter, this);
        counter++;

        System.out.println("Il corso " + code + " è stato registrato");
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getTeacher() {
        return teacher;
    }

    public int getCfu() {
        return cfu;
    }
}

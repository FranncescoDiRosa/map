package it.unikey;

import java.time.LocalDate;
import java.util.*;



public class University {

    static List<Student> student = new ArrayList<>();
    static List<Course> course = new ArrayList<>();
    static List<Exam> exam = new ArrayList<>();

    static Map<Integer, Student> listStudent = new HashMap<>();
    static Map<Integer, Course> listCourse = new HashMap<>();
    static Map<Integer, Exam> listExam = new HashMap<>();


    public static void addStudent(Student s) {
        if (!student.contains(s)) {
            student.add(s);
        } else
            System.out.println("Lo studente è già stato inserito");
    }

    public static void addCourse(Course c) {
        if (!course.contains(c)) {
            course.add(c);
        } else
            System.out.println("Il corso è stato inserito");
    }

    public static void insertExam(Exam e, Student s, Course c) {
        listStudent.put(e.idExam, s);
        listCourse.put(e.idExam, c);
        listExam.put(e.idExam, e);
    }

    public static int calcAvarage(Student student) {

        int tot = 0;

        Set<Integer> vuoto = new HashSet<>();
        Collection<Integer> kMapS = listStudent.keySet();

        for (Integer i : kMapS) {
            if (listStudent.get(i) == student) {
                vuoto.add(i);
            }
        }
        int count = vuoto.size();

        for (Integer x : vuoto) {
            tot += listExam.get(x).getVote();
        }

        return tot / count;
    }

    //ricercare tutti gli studenti che hanno media esami > X
    public static Set<Student> mediaMaxStudent(int y) {
        Set<Student> res = new HashSet<>();
        Collection<Student> l = listStudent.values();
        for (Student x : l) {
            if (calcAvarage(x) >= y) {
                res.add(x);
            }
        }
        return res;
    }

    public static Collection<Exam> serchExam(LocalDate startDate, LocalDate endDate) {
        Collection<Exam> totalExam = listExam.values();
        Set<Exam> setExam = new HashSet<>();
        for (Exam e : totalExam) {       //before data precendete        //after data successiva
            if (startDate.isBefore(e.getDateExam()) && endDate.isAfter(e.getDateExam())){
                setExam.add(e);
            }
        }
        for (Exam x : setExam) {
            System.out.println(x);
        }
        return totalExam;
    }

}
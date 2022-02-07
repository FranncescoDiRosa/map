package it.unikey;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class University {
    static HashMap<Integer, Student> studentsList = new HashMap<Integer, Student>();
    static HashMap<Integer, Course> coursesList = new HashMap<Integer, Course>();
    static HashMap<Integer, Exam> examsList = new HashMap<Integer, Exam>();

    public static int getAvg(int code){

        int studentCode = code;
        int  avg = 0;
        if (studentsList.containsKey(studentCode)){
            Student student = studentsList.get(studentCode);

            ArrayList<Integer> gradesArray = new ArrayList<>();

            for (Map.Entry<Integer, Exam> exam: examsList.entrySet()){
                if (exam.getValue().getStudent() == student){
                    gradesArray.add(exam.getValue().getResult());
                }
            }

            int sum = 0;

            for(Integer i : gradesArray){
                sum += i;
            }

            avg = sum / gradesArray.size();

        }else{
            System.out.println("Lo studente richiesto non esiste");
        }

        return avg;

    }

    public static void getStudentsOverAvg(int minAvg){
        ArrayList<Student> studentsOverAvg = new ArrayList<>();
        if(minAvg > 30 || minAvg < 18){
            System.out.println("Inserisci un numero compreso tra 18 e 30!");
        }else{
            for(int i = 0; i < studentsList.size(); i++){
                if(getAvg(i) >= minAvg){
                    studentsOverAvg.add(studentsList.get(i));
                }
            }
        }
        for (Student student : studentsOverAvg){
            System.out.println(student.getName() + " " + student.getSurname());
        }
    }

    public static void getExamsBetweenDates(){
        LocalDate date1 = InputManager.inputDate();
        LocalDate date2 = InputManager.inputDate();

        LocalDate date3;

        if (date1.isAfter(date2)){
            date3 = date2;
            date2 = date1;
            date1 = date3;
        }

        ArrayList<Exam> examsArray = new ArrayList<>();

        for (Map.Entry<Integer, Exam> exam: examsList.entrySet()){
            if (exam.getValue().getDate().isAfter(date1) && exam.getValue().getDate().isBefore(date2)){
                examsArray.add(exam.getValue());
            }
        }

        for (Exam exam : examsArray){
            System.out.println(exam.toString());
        }

    }

}

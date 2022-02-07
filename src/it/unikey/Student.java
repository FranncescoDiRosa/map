package it.unikey;

import java.util.Set;
import java.util.*;

public class Student {

     private int serialNumber;
     private String name;
     private String surname;
     private static int counter;



     public Student( String name, String surname) {
          counter++;
          this.serialNumber = counter;
          this.name = name;
          this.surname = surname;
     }

     public int getSerialNumber() {
          return serialNumber;
     }

     public void setSerialNumber(int serialNumber) {
          this.serialNumber = serialNumber;
     }

     public static int getCounter() {
          return counter;
     }

     public static void setCounter(int counter) {
          Student.counter = counter;
     }

     public String getName() {
          return name;
     }

     public String getSurname() {
          return surname;
     }

     @Override
     public String toString() {
          return name + " " + surname;
     }
}

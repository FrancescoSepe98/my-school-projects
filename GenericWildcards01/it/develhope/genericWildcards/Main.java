package it.develhope.genericWildcards;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------Start---------------------------");
        List<Integer> projectMarksListJeremy = new ArrayList<>(2);
        List<Double> individualMarksListLisa = new ArrayList<>(2);
        List<Student> listOfStudents = new ArrayList<> ();
        double lisaAvg;
        double jeremyAvg;
        //inserimento dei voti  nelle  rispettive liste
        individualMarksListLisa.add(7.5);
        individualMarksListLisa.add(9.8);
        projectMarksListJeremy.add(5);
        projectMarksListJeremy.add(9);
        //calcolo delle medie
        lisaAvg = Student.getAverageMark(individualMarksListLisa);
        jeremyAvg = Student.getAverageMark(projectMarksListJeremy);
        //inserimento dei due studenti nella lista listOfStudents
        listOfStudents.add(new Student("Lisa", "Stuart" , lisaAvg));
        listOfStudents.add(new Student("Jeremy", "Jeremy" , jeremyAvg));
        System.out.println("----------------Stampa dei due studenti----------------");
        //non ho capito perche voglia che stampi tramite get se posso fare un ciclo
        listOfStudents.stream().forEach(student -> {
            System.out.println(student.toString());
        });
    }
}

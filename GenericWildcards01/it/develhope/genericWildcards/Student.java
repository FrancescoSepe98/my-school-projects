package it.develhope.genericWildcards;

import java.util.List;

public class Student {

    public String studentName;
    public String studentSurname;
    public double marksAverage=0;

    public Student(String studentName, String studentSurname, double marksAverage) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.marksAverage = marksAverage;
    }

    static double getAverageMark(List<? extends Number> listOfMarks ){
        double average = (listOfMarks.get(0).doubleValue() + listOfMarks.get(1).doubleValue())/2;
        return average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", marksAverage=" + marksAverage +
                '}';
    }
}

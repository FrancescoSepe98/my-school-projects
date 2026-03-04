package it.develhope.VariablesMethodsConstuctor02;

public class Teacher {
    public String teacherName;

    public Teacher(){
        System.out.println("A Teacher object has been created!\n");
    }
    public void assignGrade(Student alumn,int finalGrade){
        alumn.grade = finalGrade;
    }
}

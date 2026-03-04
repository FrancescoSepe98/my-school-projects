package it.develhope.VariablesMethodsConstuctor02;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------Start--------------------");
        Student student1 = new Student("Sepe Francesco");
        Student student2 = new Student("Rossi mario");
        Teacher teacher1 = new Teacher();
        teacher1.teacherName = "Cavallo Pasquale";
        teacher1.assignGrade(student1, 10);
        teacher1.assignGrade(student2, 3);
        System.out.println("--------------------printing student 1 details--------------------");
        student1.getStudentDetails();
        System.out.println("--------------------printing student 2 details--------------------");
        student2.getStudentDetails();
    }
}
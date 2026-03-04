package it.develope.ClassesAndObject;

public class TestProgrammers {
    public static void main(String args[]){
        System.out.println("--------Start------------");
        Programmer programmatore1 = new Programmer();
        Programmer programmatore2 = new Programmer();
        programmatore1.age = 24;
        programmatore1.name = "Francesco Sepe";
        programmatore1.wearGlasses = false;
        programmatore2.age = 42;
        programmatore2.name = "Mario Rossi";
        programmatore2.wearGlasses = true;
        System.out.println("--testiamo il metodo printDetails per l'istanza programmatore1--");
        programmatore1.printDetails();
        System.out.println("--testiamo il metodo drinkCoffe per l'istanza programmatore1--");
        programmatore1.drinkCoffe();
        System.out.println("--testiamo il metodo printDetails per l'istanza programmatore2--");
        programmatore2.printDetails();
        System.out.println("--testiamo il metodo hasGlasses per l'istanza programmatore2--");
        programmatore2.hasGlasses();
    }
}

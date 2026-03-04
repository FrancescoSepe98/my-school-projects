package it.develhope.Polymorphism02;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------Start--------------------------------");
        Animal animalUndefined = new Animal("Giorgio");
        Lyon leo = new Lyon("Leo");
        Cow lorenza = new Cow("Lore");
        System.out.println("-----------------Printing an undefined animal sound-------------------");
        System.out.println(animalUndefined.animalSound());
        System.out.println("----------------------Printing a lyon sound---------------------------");
        System.out.println(leo.animalSound());
        System.out.println("----------------------Printing a cow sound----------------------------");
        System.out.println(lorenza.animalSound());
        System.out.println("---------------------------------End----------------------------------");
    }
}
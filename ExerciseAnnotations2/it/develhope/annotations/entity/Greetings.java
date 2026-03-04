package it.develhope.annotations.entity;

public class Greetings {
    @NotNull
    @IsAString
    public String name;



    public Greetings(String name){
        this.name = name;

    }
    public Greetings(){}

    @DevAnnotation(devName = "Jhon", devSurname = "Walker")
    public void sayWelcome(String name){
        System.out.println("Welcome " + name);
    }

    @DevAnnotation(devName = "Mark", devSurname = "Brown")
    public void sayGoodbye(String name){
        System.out.println("Goodbye " + name);
    }

}

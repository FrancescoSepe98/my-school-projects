package it.develhope.polymorphism01;

public class Animal {
    public String animalName;

    public Animal(String name){
        this.animalName=name;
    }
    public String animalSound(){
        return "Roarr!";
    }
    public String animalSound(String x){
        if(x.equals("High")){
            return "Roarrrrrrrr!";
        } if (x.equals("Low")){
            return "Roar";
        } else {
            return "Cannot reproduce it properly";
        }
    }
}

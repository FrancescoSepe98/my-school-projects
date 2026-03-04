package it.develhope.Polymorphism02;

public class Cow extends Animal{

    public Cow(String name) {
        super(name);
    };

    @Override
    public String animalSound() {
        return "Muuuuu";
    }
}

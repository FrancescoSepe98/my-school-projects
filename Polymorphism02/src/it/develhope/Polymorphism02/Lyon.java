package it.develhope.Polymorphism02;

public class Lyon extends Animal{


    public Lyon(String name) {
        super(name);
    };

    @Override
    public String animalSound() {
        return "Roooooooaar";
    }
}

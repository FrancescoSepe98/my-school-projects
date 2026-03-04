package it.develope.VariablesMethodsCostructor01;

public class House {
    public String address;
    public int numbersOfFloors;

    public House (String address, int numbersOfFloors){
        System.out.println("The house has been created!");
        this.address=address;
        this.numbersOfFloors=numbersOfFloors;
    }
}

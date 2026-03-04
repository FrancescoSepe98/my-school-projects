package it.develope.VariablesMethodsCostructor01;

public class Main {
    public static void main(String[] args) {
        House house1 = new House("Via Antonio da Legnago 96, Casignana (Reggio Calabria)",2);
        House house2 = new House("Via Varrone 89, Staturano(Caserta)",3);
        System.out.println("Printing the first House Details");
        System.out.println(house1.address + "Floors number"+ " " + house1.numbersOfFloors);
        System.out.println("Printing the second House Details");
        System.out.println(house2.address + "Floors number"+ " " + house2.numbersOfFloors);
    }
}
package it.develhope.list;

import java.util.*;


public class Main {
    public static void main(String[] args) {
    List <String> cityNames = Arrays.asList("Napoli","Milano","Torino");
    List <String> kingsOfRome = new ArrayList<>(7);
    String [] kingsOfRomeArray = new String[7];
        System.out.println("Stampa della lista iniziale");
    cityNames.stream().forEach(string ->{
        System.out.println(string.toString());
    });
    try {
        cityNames.set(3, "Palermo");//questo non funziona perche  va oltre la lunghezza consentita dalla lista
        cityNames.add("Palermo");//non riesco a capire il perche ma add non funziona minimamente come se non fosse una lista
    } catch (Exception e) {
        System.out.println("Stampa dell' Errore " + e);
    }
        System.out.println("Stampa della lista modificata");
        cityNames.set(1,"Tegucigalpa");
        cityNames.stream().forEach(string ->{
            System.out.println(string.toString());
        });
        System.out.println("--------------------------------------------------------------------------------------");

        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Anco Marco");
        kingsOfRome.add("Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");
        kingsOfRome.add("Tarquinio il Superbo");
        System.out.println("Stampa della lista kingsOfRome");
        kingsOfRome.forEach(s -> {
            System.out.println(s);
        });

        kingsOfRome.toArray(kingsOfRomeArray);
        kingsOfRomeArray[6]="Lucius Tarquinius Supercar";
        System.out.println("Stampa dell'array kingsOfRomeArray");
        System.out.println(Arrays.toString(kingsOfRomeArray));

    }
}

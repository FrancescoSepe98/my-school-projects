package it.develhope.array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] carBrands = new String[]{"Fiat", "Ferrari", "BMW", "Lamborghini", "Audi"};
        int[] primeNumbers = new int[20];
        System.out.println("Stampa di tutto l'array");
        System.out.println(Arrays.toString(carBrands));
        System.out.println("Stampa del terzo elemendo dell'array");
        System.out.println(carBrands[2].toString());
        for (int i = 0; i < primeNumbers.length; i++) {
            int x = generateNextPrime(primeNumbers, i);
            primeNumbers[i] = x;
        }
        System.out.println("Stampa dei primi 20 numeri primi");//ci ho messo 4 ore a far funzionare sta roba, quindi
        System.out.println(Arrays.toString(primeNumbers));//col cavolo che stampo solo i primi 6, almeno 20!
    }

    /**
     * Questo metodo controlla se un numero è primo
     * @param x il numero da verficare
     * @return ritorna true se è solo se x è un numero divisibile solo per 1 e per se stesso
     */
    public static boolean checkPrimeNumber(int x) {
        for (int j = 2; j <= x / 2; j++) {
            if (x % j == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Questo metodo mi permette, di generare il prossimo numero primo a partire da un punto prestabilito
     * @param array e' l'array dal quale estrarremo l'ultimo valore inserito
     * @param i e' l'indice dell'array nel quale dobbiamo andar ad inserire il prossimo numero primo
     * @return questo metodo ci ritorna 1 se i e' uguale a 0, in tutti gli altri casi ritornera' il prossimo numero primo
     * successivo ad array[i-1]
     */
    public static int generateNextPrime(int[] array, int i) {
        if (i == 0) {
            return 1;}
        boolean flag = false;
        int j = i;
        while (flag != true) {
            i++;
            if (i>array[j-1]){
                flag=checkPrimeNumber(i);
            }

        }
        return i;
    }
}




import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inserisci il dividendo ed il divisore");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(Division.doDivision(scanner.nextDouble(), scanner.nextDouble()));
        } catch (InputMismatchException input) {
            System.out.println("Errore! il valore da te inserito non e' un numero\n" + input.toString());
        }
        System.out.println("program still work here");

    }
}


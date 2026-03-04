import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Romano romano = new Romano();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Inserire il numero da voler convertire in numeri romani");
    int x = scanner.nextInt();
    romano.conversioneInNumeroRomano(x);
    }
}

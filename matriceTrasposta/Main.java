import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer [][] matrice = {
                {1,2,3,4},
                {5,6,7,8},
                {12,34,55,67}
        };
        Integer [] [] matriceTrasposta = new Integer [matrice[0].length][matrice.length];
        FunzioniMatrici<Integer> fun = new FunzioniMatrici();

        matriceTrasposta = fun.caloloTrasposta(matrice,matriceTrasposta);
        System.out.println("Stampa della matrice");
        fun.printMatrice(matrice);
        System.out.println("Stampa della matrice trasposta");
        fun.printMatrice(matriceTrasposta);
    }
}

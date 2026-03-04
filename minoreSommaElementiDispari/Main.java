import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {4,3,8,11,4} ;
        FunzioniArrayInt fun = new FunzioniArrayInt();
        System.out.println("calcolare la minore somma possibile per una qualsiasi disposizione degli elementi in posizione dispari del seguente array");
        System.out.println(Arrays.toString(array));
        fun.printMinorSommaPossibile(array);
        System.out.println("ordinare l' array affinchè la somma degli elementi di posizione dispari sia la minore possibile.");
        System.out.println("array di partenza");
        System.out.println(Arrays.toString(array));
        array= fun.sortArray(array);
        System.out.println("array ordinato");
        System.out.println(Arrays.toString(array));
    }
}

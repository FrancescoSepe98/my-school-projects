import java.util.Arrays;

/**
 * Esercizio svolto in pair programming da Sepe Francesco e Gennarelli Maria Rosa
 */

public class Main {
    public static void main(String[] args) {
        String [] aliceToDos = new String[]{"Coding","Reading","Learning"};
        String [] bobToDos  = new String[]{"Reading","Coding","Learning","Sleeping"};
        String [] timToDos  = new String[]{"Reading","Learning","Coding"};
        System.out.println("----------------------start----------------------\n");
        System.out.println("Alices array equal to Bob array? " + Arrays.equals(aliceToDos,bobToDos));

        System.out.println("Alices array equal to Tim  array? " + Arrays.equals(aliceToDos,timToDos));

        System.out.println("Is Alice's array having the same length of Bob's array? " + (aliceToDos.length == bobToDos.length));

        System.out.println("Is Alice's array having the same length of Tim's array? " + (aliceToDos.length == timToDos.length));

        Arrays.sort(aliceToDos);
        Arrays.sort(bobToDos);
        Arrays.sort(timToDos);

        System.out.println("Is Alice having the same tasks of Bob? " + Arrays.equals(aliceToDos,bobToDos));
        System.out.println("Is Alice having the same tasks of Tim? " + Arrays.equals(aliceToDos,timToDos));
    }
}

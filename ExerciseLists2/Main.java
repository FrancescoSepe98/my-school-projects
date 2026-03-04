import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------Start------------------");
        List <Integer> divisorsOf52 = new ArrayList<>();
        List <Integer> randomNumbers = new ArrayList<>();

        randomNumbers.add(1);
        randomNumbers.add(60);
        randomNumbers.add(13);
        randomNumbers.add(12);
        divisorsOf52 = searchPositiveNumbersDivirsors(divisorsOf52,52);

        System.out.println("Stampa della lista divisorsOf52");
        divisorsOf52.stream().forEach(s->{
            System.out.println(s);
        });
        System.out.println("Stampa della lista randomNumbers");
        randomNumbers.stream().forEach(s->{
            System.out.println(s);
        });
        randomNumbers.addAll(divisorsOf52);
        System.out.printf("Stampa dei %d valori di randomnumbers dopo aver accodato i valori di divisorsOf52\n",randomNumbers.toArray().length);
        randomNumbers.stream().forEach(s->{
            System.out.println(s);
        });
        randomNumbers = removeDuplicate(randomNumbers);
        System.out.println("Stampa della lista randomnumbers in ordine decrescente, dopo aver eliminato i duplicati");
        randomNumbers.stream().forEach(s->{
            System.out.println(s);
        });











    }

    /**
     * Questo metodo serve per selezionere tutti i divisori di un dato numero n positivo.
     * @param output e' la lista che conterra' tutti i divisori di n.
     * @param n e' il numero del quale vogliamno conoscere i divisori.
     * @return ritorna una lista<Integer> che contiene tutti i divisori positivi di n.
     */
    public static List<Integer> searchPositiveNumbersDivirsors(List<Integer> output,int n){
        if (n<0){
            System.out.printf("Errore, hai inserito %d, questa funzione accetta solo n>0\n",n);
            throw new ArithmeticException();
        }
        for (int i = 1; i < (n/2)+1; i++) {
            if (n%i==0){
                output.add(i);
            }
        }
        output.add(n);
        return output;
    }

    /**
     * questo metodo elimina i duplicati presenti nelle liste ordinate
     * @param output Accetta una lista di Integer
     * @return ritorna la lista ordinata in ordine decrescente dopo aver rimosso i duplicati
     */
    public static List<Integer> removeDuplicate(List<Integer> output){
    System.out.println("------Inizio del processo eliminazione duplicati------");
        Collections.sort(output, (o1, o2) -> {
            return o2.compareTo(o1);
        });
    for (int i = 0; i < output.toArray().length-1 ; i++) {
        if (output.get(i)==output.get(i+1)){
            System.out.printf("-l'elemento %d e' un duplicato quindi verra' eliminato dalla lista\n",output.get(i));
            output.remove(i);
        }
    }
    return output;
    }
}


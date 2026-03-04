
public class FunzioniArrayInt {
    public void printMinorSommaPossibile(int[] array) {
        int oddsPositions = indexOddCounter(array);
        int result = 0;
        while (oddsPositions > 0) {
            int indexToEliminate = 0;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[indexToEliminate] > array[j + 1]) {
                    indexToEliminate = j + 1;
                }
            }
            result = result + array[indexToEliminate];
            array = removeElement(array, indexToEliminate);
            oddsPositions--;
        }
        System.out.println("la somma minore possibile e' " + result);
    }

    /**
     * Questo metodo ci permette di elminare da un array statico l'elemento in posizione i
     * @param array l'array dal quale va eliminato l'elemento
     * @param index l'indice che si riferisce all'elemento da eliminare
     * @return il metodo ritorna un nuovo array privo dell'elemento in posizione i, di dimensioni array.lenght-1,
     */
    public int[] removeElement(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }

    /**
     * Questo metodo ci permette di ordinare l' array affinchè la somma degli elementi di
     * posizione dispari sia la minore possibile.
     * Ad esempio dato l' array {4,3,8,11,4} l' array risultante deve essere {8,3,11,4,4} con somma 7.
     * @param array
     * @return ritorna l'array ordinato
     */
    public int[] sortArray(int[] array) {
        int[] resultArray = new int[array.length];
        int indexToEl;
        int indexOddsArray = indexOddCounter(array);
        int[] tempArray = new int[indexOddsArray];
        int indexTemp = 0;
        while (indexOddsArray>0){
            indexToEl = 0;
            int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            if (temp>array[i]){
                temp=array[i];
                indexToEl = i;
            }
        }
            array= removeElement(array, indexToEl);
            tempArray[indexTemp] = temp;
        if (indexTemp>0 && tempArray[indexTemp]<tempArray[indexTemp-1]){
            temp = tempArray[indexTemp-1];
            tempArray[indexTemp-1] = tempArray[indexTemp];
            tempArray[indexTemp] = temp;
        }
        indexTemp++;
        indexOddsArray--;
        }
        indexTemp = 0;
        indexOddsArray = 0;
        for (int i = 0; i < resultArray.length; i++) {
            if (i%2!=0){
                resultArray[i] = tempArray[indexTemp];
                indexTemp++;
            } else {
                resultArray[i] = array[indexOddsArray];
                indexOddsArray++;
            }
        }
        return resultArray;
    }


    /**
     * Questo metodo ci permette di contare quanti sono gli indici dispari all'interno dell'array
     * @param
     * @return ritorna il numero ti indici dispari all'interno dell'array
     */
    public int indexOddCounter(int [] array){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if ((i)%2!= 0){
            counter ++;
            }
        }
        return counter;
    }
}

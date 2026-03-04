import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Romano {
    public void conversioneInNumeroRomano(int number) {
        Character[] array = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        Integer[] value = {1, 5, 10, 50, 100, 500, 1000};
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], value[i]);
        }
        List<Character> output = new ArrayList<>();
        System.out.printf("la versione in numero romano di %d", number);
        while (number > 0) {
            if (number == 4) {
                output.add('I');
                output.add('V');
                number -= 4;
            } else if (number == 9) {
                output.add('I');
                output.add('X');
                number -= 9;
            } else if (number >= 40 && number < 50) {
                output.add('X');
                output.add('L');
                number -= 40;
            } else if (number >= 90 && number < 100){
                output.add('X');
                output.add('C');
                number -= 90;
             }
            else if (number >= 400 && number < 500) {
                output.add('C');
                output.add('D');
                number -= 400;
            }
            else if (number >= 900 && number < 100) {
                 output.add('C');
                 output.add('M');
                 number -= 900;
        }
            else if (number >= map.get('M')){
                output.add(array[array.length-1]);
                number -=map.get('M');
            } else if (number >= map.get('D') ) {
                output.add(array[array.length-2]);
                number -=map.get('D');
            } else if (number >= map.get('C') ) {
                output.add(array[array.length-3]);
                number -=map.get('C');
            } else if (number >= map.get('L') ) {
                output.add(array[array.length-4]);
                number -=map.get('L');
            } else if (number >= map.get('X') ) {
                output.add(array[array.length-5]);
                number -=map.get('X');
            } else if (number >= map.get('V') ) {
                output.add(array[array.length-6]);
                number -=map.get('V');
            } else if (number >= map.get('I') ) {
                output.add(array[array.length-7]);
                number -=map.get('I');
            }
        }
        System.out.println(" e' " + output);
    }
}

package develhope.it.firstApi.Logica;

public class Factorial {


    public static Integer factorial(Integer x) {
        Integer i;
        Integer result = 1;
        for (i = 1; i < x; i++) {
            result = result*(i+1);
        }
        return result;
    }

}

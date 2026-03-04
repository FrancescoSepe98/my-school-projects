import java.text.DecimalFormat;

public class Division {
    public static String doDivision(Double dividend, Double divisor) throws ArithmeticException {
        try {
            if (divisor == 0) {
                throw new ArithmeticException("Attenzione Il divisore non puo essere uguale a zero");
            } else {
                DecimalFormat d = new DecimalFormat("0.0000");
                double result = dividend / divisor;
                return d.format(result);//sta roba qua si fa per avere piu numeri oltre la virgola?
                //System.out.printf("il risultato %.4f",result); oppure era meglio fare cosi col metodo void
            }
        } catch (ArithmeticException e) {
            return e.toString();//ma ha senso? funziona solo perche ho messo il return string
        }
    }
}

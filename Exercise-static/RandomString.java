public class RandomString {

    /**
     * Questo metodo ci permette di creare una stringa alphanumerica randomica di lunghezza n
     * @variable AlphaString deve essere inizializzata con tutti i caratteri che noi vogliamo generare
     * @variable sb sara' il nostro array di char vuoto di lunghezza n che ritorneremo sottoforma di stringa
     * @variable index andremo ad assegnargli un valore random tra 0 ed AlphaString.length() cosi da
     * scegliere il carattere da inserire in sb
     * @param n lunghezza della stringa
     * @return ritorneremo sb convertito il stringa grazie al metodo to.String()
     */
    static String getAlphaNumericString(int n){
        String AlphaString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvxyz" + "123456789";
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index = (int)(AlphaString.length() * Math.random());
            sb.append(AlphaString.charAt(index));
        }
        return sb.toString();
    }



}

public class Main {
    public static void main(String[] args) {
        checkPalindrome(30703);
    }
    static int calculateLastNumber(int x){
        return x%10;
    }

    static int bildReverse(int reverse,int x){
        return (reverse * 10) + calculateLastNumber(x);
    }

    static void checkPalindrome(int x){
        int value = x;
        if(x>0 && x<10){
            System.out.println("il numero è palindromo");
        } else {
            int reverse = 0;
            while (value > 0) {
                reverse = bildReverse(reverse, value);
                value = value / 10;
            }
            System.out.println(reverse);
            if ((x - reverse) == 0) {
                System.out.println("Il numero è palindromo");
            } else System.out.println("il numero non è palindromo");
        }
    }
}

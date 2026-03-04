public class Main {
    public static void main(String[] args) {
    int x = 32;
    int counter = 0;
    while (x!=0){
        if (x-11>=0) {
            x = x - 11;
            counter++;
        } else if (x-10>=0){
            x = x - 10;
            counter++;
        } else if (x-1>=0){
            x = x - 1;
            counter++;
        }
    }
        System.out.println(counter);
    }
}

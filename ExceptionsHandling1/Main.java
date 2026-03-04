
public class Main {
    public static void main(String[] args) {
    double score0 = 2.15;
    double score1 = 50;
    double score2 = 95.02;
    double score3 = 100.01;
    double score4 = -10;

    checkScore(score0);
    checkScore(score1);
    checkScore(score2);
    checkScore(score3);
    checkScore(score4);

    System.out.println("The program is working here");
    }
    static void checkScore(double score) throws ArithmeticException{
        try {
            if (score>0 && score <= 50){
                System.out.println("Average score");
            }else if (score>50 && score <= 100){
                System.out.println("Very good score");
            } else throw new ArithmeticException();
        } catch (Exception e) {
            System.out.printf("Score is out of scale! %f is not a valid score\n",score);
        }
    }
}


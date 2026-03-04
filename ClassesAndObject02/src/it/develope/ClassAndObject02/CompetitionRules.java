package it.develope.ClassAndObject02;

public class CompetitionRules {
    private static CompetitionRules competitionRules = new CompetitionRules();




    private CompetitionRules() {}

    public static CompetitionRules getInstance() {
        return competitionRules;
    }


    private String competitionRule1 = "Do not copy and paste from StackOverflow!";
    private String competitionRule2 = "Learn every day!";
    private String competitionRule3 = "Be the best team!";
    public void printRules(){
        System.out.println("Rule 1->" + competitionRule1);
        System.out.println("Rule 2->" + competitionRule2);
        System.out.println("Rule 3->" + competitionRule3);
    }
}

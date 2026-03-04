package it.develope.ClassAndObject02;

public class Competition {
    public static void main (String args[]){
        System.out.println("The program is starting");
        CompetitionRules competitionRules = CompetitionRules.getInstance();
        /** printing all the rules*/
        competitionRules.printRules();
        System.out.println("-------------------------------");
        Team teamA = new Team();
        Team teamB = new Team();
        /** Value assignment of both teams*/

        teamA.teamName = "Alunno e coach";
        teamB.teamName = "Coordinatori";
        teamA.p1.name = "Francesco Sepe";
        teamA.p1.yearsOfExperience = 0;
        teamA.p1.programmingLanguage = "C";
        teamA.p2.name = "Pasquale Cavallo";
        teamA.p2.yearsOfExperience= 10;
        teamA.p2.programmingLanguage = "Java";
        teamB.p1.name = "Sara Costanzo";
        teamB.p1.yearsOfExperience = 5;
        teamB.p1.programmingLanguage = "Javascript";
        teamB.p2.name = "Luca Reina";
        teamB.p2.yearsOfExperience = 3;
        teamB.p2.programmingLanguage = "C++";


        /** Printing Team A and Team B details*/
        System.out.println("Details team A");
        teamA.printTeamDetails();
        System.out.println("Details team B");
        teamB.printTeamDetails();
    }
}

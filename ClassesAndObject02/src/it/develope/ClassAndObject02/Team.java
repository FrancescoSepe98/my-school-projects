package it.develope.ClassAndObject02;

public class Team {
    public String teamName;
    Programmer p1 = new Programmer();
    Programmer p2 = new Programmer();

    public void printTeamDetails(){
        System.out.println("Team name->" + teamName + "\nFirst programmer:" + " " + p1.printProgrammerDetails() + "\nSecond programmer:" + p2.printProgrammerDetails());
    }

    }


package it.develope.ClassAndObject02;

public class Programmer {
    public String name;
    public String programmingLanguage;
    public int yearsOfExperience;

    public String printProgrammerDetails(){
        return  "\n"+"Name->" + name + " " + "Programming language->" + programmingLanguage + " " + "Years of experience->"+yearsOfExperience;
    }
}

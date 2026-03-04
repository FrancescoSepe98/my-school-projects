package it.develhope.Interfaces;

public class Professor extends CollegePerson implements ITeachingPerson {
    protected String teachingSubject;
    public Professor (String name,String surname,int Id,String subject){
        this.name=name;
        this.surname=surname;
        this.collegeId=Id;
        this.teachingSubject=subject;
    }

    @Override
    public String goToCollege(){
        return "im " + name + " " + surname + " " + collegeId +" " + "my subject is " + teachingSubject;
    }
    @Override
    public String teachToOtherPeople() {
        return goToCollege() + " and Im a teacher";
    }
}

package it.develhope.Interfaces;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------start----------");
        Student student = new Student("Francesco", "Sepe", 12345, 2022);
        Professor professor = new Professor("Pasquale", "Cavallo", 54321, "Java");
        Assistant assistant = new Assistant("Francesco", "Sepe", 12345, true);
        System.out.println("-------------------invoke the goToCollege() method-------------------");
        /** Eseguo il test tramite il metodo studyAtHome in quanto implicitamente
         * evocherà il metodo goToCollege()
         */
        System.out.println(student.studyAtHome());
        System.out.println("--------------------------------------");
        /** Eseguo il test tramite il metodo teachToOtherPeople in quanto implicitamente
         * evocherà il metodo goToCollege()
         */
        System.out.println(professor.teachToOtherPeople());
        System.out.println("--------------------------------------");
        /** Per quanto riguarda Assistant ho preferito evitare che entrambe le funzioni
         * invocassero goToCollege in quanto in caso avessimo bisogno di invocarle entrambe sulla stessa
         * riga avverrebbe una ridondanza.
         */
        System.out.println(assistant.goToCollege() + assistant.teachToOtherPeople() + assistant.studyAtHome());
        System.out.println("-------------------invoke the implemented methods from interfaces-------------------");
        ILearningPerson studentFromInterface = new ILearningPerson() { //dichiarazione variabile a partire dall'interfaccia
            @Override
            public String studyAtHome() {
                return "i prefer to study from home";
            }
        };
        System.out.println("im a student " + studentFromInterface.studyAtHome());
        System.out.println("--------------------------------------");
        ITeachingPerson professorFromInterface = new ITeachingPerson() {//dichiarazione variabile a partire dall'interfaccia
            @Override
            public String teachToOtherPeople() {
                return "Im a teacher";
            }
        };
        System.out.println(professorFromInterface.teachToOtherPeople());
        System.out.println("--------------------------------------");
        ILearningPerson assistantStudentFromInterface = new ILearningPerson() {
            @Override
            public String studyAtHome() {
                return "i prefer to study from home";
            }
        };
        ITeachingPerson assistantProfessorFromInterface= new ITeachingPerson() {//dichiarazione variabile a partire dall'interfaccia
            @Override
            public String teachToOtherPeople() {//dichiarazione variabile a partire dall'interfaccia
                return "Im a teacher";
            }
        };

        System.out.println("im an assistant and " + assistantStudentFromInterface.studyAtHome());
        System.out.println("--------------------------------------");
        System.out.println("im an assistant and also " + assistantProfessorFromInterface.teachToOtherPeople());


    }
}
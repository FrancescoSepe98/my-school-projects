package it.develhope.annotations;
import it.develhope.annotations.entity.*;
import it.develhope.annotations.validators.*;

import java.lang.reflect.Method;


//pasquale vado un po fuori traccia in quanto sto provando a fare i validators come da tuo video, scusami ahahha
public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException {
        System.out.println("----------------------------Start----------------------------");
        Greetings greetings = new Greetings("Francesco");
        Greetings greetings2 = new Greetings();//creo un oggetto con nome = null per testare il NotNullValidator
        Persona persona = new Persona("Alessio", 28);//creo un oggetto sul cui testare il IsAStringValidator
        Validators validator = new Validators();
        System.out.println("----------------------------Test NotNullValidator--------------------------");
        validator.validatorMap(NotNull.class,new NotNullValidator());
        System.out.println("Greetings contiene solo valori not null? " + validator.validate(greetings));
        System.out.println("Greetings2 contiene solo valori not null? " + validator.validate(greetings2));
        System.out.println("----------------------------Test IsAStringValidator--------------------------");
        validator.validatorMap(IsAString.class,new IsAStringValidator());
        System.out.println("persona contiene solo Stringhe? " + validator.validate(persona));
        System.out.println("greetings contiene solo Stringhe? " + validator.validate(greetings));
        System.out.println("greetings2 contiene solo Stringhe? " + validator.validate(greetings2));//quindi non funziona
        //l'istance of su un oggetto il cui valore e' Null :(

        System.out.println("----------------------------Start Esercizio effettivo--------------------------");
        Method [] method = Greetings.class.getMethods();

        greetings.sayWelcome("Francesco");
        greetings.sayGoodbye("Francesco");

        //non ho trovato altri modi per stamparmi il nome del metodo e poi i valori conservati nelle annotazioni,
        //probabilmente mi son perso qualcosa, diciamo che volevo perdere un po di tempo con la reflection
        System.out.println("Il metodo " + method[0].getName() + " e' stato scritto da " +
                method[0].getAnnotation(DevAnnotation.class).devName() + " " + method[0].getAnnotation(DevAnnotation.class).devSurname());
        System.out.println("Il metodo " + method[1].getName() + " e' stato scritto da " +
                method[1].getAnnotation(DevAnnotation.class).devName() + " " + method[1].getAnnotation(DevAnnotation.class).devSurname());
    }
}

package it.develhope.annotations.validators;

import it.develhope.annotations.interfaces.IValidator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;


public class Validators {
    Map<Class<?>, IValidator> validatorMap = new HashMap<>();

    public boolean validate(Object o) throws IllegalAccessException, IllegalArgumentException {
        Field [] fields = o.getClass().getDeclaredFields();//qui prendiamo tutti i campi dell oggetto o
        for (Field f: fields) {
            Annotation [] annotations = f.getAnnotations(); //qui per ogni campo creiamo un array delle sue annotazioni
            for (Annotation a : annotations){
                if(validatorMap.containsKey(a.annotationType())){ //qui stiamo controllando se quel campo abbia la annotazione NotNull
                    if (!validatorMap.get(a.annotationType()).validate(f.get(o))){ //qui tramite la chiave troviamo il validator associato
                                                                                            //e dal validator chiamiamo Validate.
                        return false;
                    }
                }
            }
        }
        return true;
    }


    public void validatorMap(Class<?> c , IValidator v) {
        validatorMap.put(c,v);
    }
}

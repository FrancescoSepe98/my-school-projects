package it.develhope.annotations.validators;

import it.develhope.annotations.interfaces.IValidator;

public class NotNullValidator implements IValidator {


    @Override
    public boolean validate(Object o) {
       return o!=null;
    }
}

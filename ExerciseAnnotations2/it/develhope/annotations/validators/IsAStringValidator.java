package it.develhope.annotations.validators;

import it.develhope.annotations.interfaces.IValidator;

public class IsAStringValidator implements IValidator {
    @Override
    public boolean validate(Object o) {
        return o instanceof String;
        }
    }



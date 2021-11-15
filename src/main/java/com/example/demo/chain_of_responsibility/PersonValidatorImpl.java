package com.example.demo.chain_of_responsibility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Component
public class PersonValidatorImpl implements PersonValidator {

    @Autowired
    private List<Validator> validators;

    @Override
    public void validate(Person person) throws PersonValidationException {

        StringBuilder errorMessageBuilder = new StringBuilder();
        for (Validator validator : validators) {
            String msg = validator.validate(person);
            if (!msg.isEmpty()) {
                errorMessageBuilder.append(msg).append("\n");
            }
        }
        String message = errorMessageBuilder.toString();
        if (!message.isEmpty()) {
            throw new PersonValidationException(message);
        }
    }

    @Override
    public void addValidator(Validator validator) {
        validators.add(validator);
    }
}

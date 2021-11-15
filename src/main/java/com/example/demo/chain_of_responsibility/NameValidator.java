package com.example.demo.chain_of_responsibility;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class NameValidator implements Validator {
    @Override
    public String validate(Person person) {
        if (person.getName() == null || person.getName().isEmpty()) {
            return "name not initialized";
        }

        return "";
    }
}

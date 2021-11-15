package com.example.demo.chain_of_responsibility;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class EmailValidator implements Validator {
    @Override
    public String validate(Person person) {
        String email = person.getEmail();
        if (email == null) {
            return "email not initialised";
        }
        if (!email.contains("@")) {
            return "@ not exists";
        }
        if (!email.contains("\\.")) {
            return ". not exists";
        }

        if (email.indexOf("@") > email.indexOf("\\.")) {
            return "@ must come before .";
        }
        return "";
    }
}

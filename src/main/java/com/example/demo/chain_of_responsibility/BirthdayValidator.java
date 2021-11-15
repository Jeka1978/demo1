package com.example.demo.chain_of_responsibility;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author Evgeny Borisov
 */
@Component
public class BirthdayValidator implements Validator {
    @Override
    public String validate(Person person) {
        if (person.getBirthday().isAfter(LocalDate.now())) {
            return "not born yet!";
        }
        if (ChronoUnit.YEARS.between(person.getBirthday(), LocalDate.now()) > 120) {
            return "the person already dead or almost dead";
        }

        return "";
    }
}

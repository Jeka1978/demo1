package com.example.demo.chain_of_responsibility;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Profile("PROD")
//spring.profiles.active=PROD
public class SalaryValidator implements Validator {
    @Override
    @Async
    public String validate(Person person) {
        if (person.getSalary() < 0) {
            return "salary can't be negative";
        }
        return "";
    }
}

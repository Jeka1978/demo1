package com.example.demo.chain_of_responsibility;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class SalaryValidator implements Validator {
    @Override
    public String validate(Person person) {
        if (person.getSalary() < 0) {
            return "salary can't be negative";
        }
        return "";
    }
}

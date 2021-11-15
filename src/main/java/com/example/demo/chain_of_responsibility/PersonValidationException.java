package com.example.demo.chain_of_responsibility;

/**
 * @author Evgeny Borisov
 */
public class PersonValidationException extends RuntimeException {
    public PersonValidationException(String message) {
        super(message);
    }
}

package com.example.demo.my_spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Primary
public class ConsoleSpeaker implements Speaker {

    @Override
    public void speak(String message) {
        System.out.println(message);
    }
}

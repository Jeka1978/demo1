package com.example.demo.my_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class IRobot {


    @Autowired
    private Speaker speaker;
    @Autowired
    private Cleaner cleaner;

    public void cleanRoom() {
        speaker.speak("I started");
        cleaner.clean();
        speaker.speak("I finished");
    }
}








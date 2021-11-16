package com.example.demo.my_spring;

import org.springframework.stereotype.Component;

import javax.swing.*;

/**
 * @author Evgeny Borisov
 */
@Component
public class PopupSpeaker implements Speaker {
    @Override
    public void speak(String message) {
        JOptionPane.showMessageDialog(null,message);
    }
}

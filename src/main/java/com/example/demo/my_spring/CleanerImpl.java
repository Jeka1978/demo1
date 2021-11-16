package com.example.demo.my_spring;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class CleanerImpl implements Cleaner {

    @InjectRandomInt(min = 3,max = 7)
    private int repeat;

    @InjectRandomName
    private String name;


    @Override
    public void clean() {
        System.out.println("cleaner which name is: "+name+" loves you!");
        for (int i = 0; i < repeat; i++) {
            System.out.println("VVVVVVVVVVVVVvvvvvvvvvvvvvvvvvv");
        }
    }
}

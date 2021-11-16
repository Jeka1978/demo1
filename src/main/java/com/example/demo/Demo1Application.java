package com.example.demo;

import com.example.demo.my_spring.IRobot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Demo1Application.class, args);
        IRobot iRobot = context.getBean(IRobot.class);
        iRobot.cleanRoom();

    }

}

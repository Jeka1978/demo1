package com.example.demo.chain_of_responsibility;

import lombok.SneakyThrows;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Constructor;
import java.time.LocalDate;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan(basePackages = "com.example")
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Person person = Person.builder().birthday(LocalDate.of(2225, 1, 1)).email("abx").salary(-1000).build();


        ConfigurableApplicationContext context = SpringApplication.run(Main.class);
        PersonValidator personValidator = context.getBean(PersonValidator.class);
        personValidator.validate(person);
    }
}






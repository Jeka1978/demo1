package com.example.demo.chain_of_responsibility;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class StamService {

    @Scheduled(fixedDelay = 1000)
    public void doWork(){
        System.out.println("WORKING HARD!!!!");
    }
}

package com.dog.delivery.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Slf4j
@Component
public class ExemploCommandRunner implements CommandLineRunner {
    
	@Override
    public void run(String ... args) throws Exception {

        log.info("==== ExemploCommandRunner ====");
        
		for (String arg : args)
            log.info("["+arg+"]");

        log.info("==== ExemploCommandRunner ====");
    }
}
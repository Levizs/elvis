package com.dog.delivery.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;
@Slf4j
@Component
public class ExemploAppRunner implements ApplicationRunner {
    
	@Override
    public void run(ApplicationArguments args) throws Exception {

        log.info("==== ExemploAppRunner ====");
        boolean debug = args.containsOption("debug");
        List<String> files = args.getNonOptionArgs();
        log.info("Chamou com debug? #{}", debug);
        log.info(String.valueOf(files));
        log.info("==== ExemploAppRunner ====");
    }
}
package org.jack.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by jackson on 04/01/17.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "org.jack.library")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

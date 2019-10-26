package com.sda.javadublin1.travelserviceproject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TravelServiceProjectApplication {

    // in spring you can use properties thanks to the @Value annotation
    // it is used to parameterize the system
    // can be used in controllers, services etc.
    // look at application.properties
    @Value("${currency}")
    private String currency;

    public static void main(String[] args) {
        SpringApplication.run(TravelServiceProjectApplication.class, args);
    }

    // this function can be used to test spring components
    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> System.out.println(currency);
    }
}

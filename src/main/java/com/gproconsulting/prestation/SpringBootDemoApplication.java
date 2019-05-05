package com.gproconsulting.prestation;

    
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan("com.gproconsulting.prestation.domain")
@ComponentScan({"com.gproconsulting.prestation.controller","com.gproconsulting.prestation.service","com.gproconsulting.prestation.repository"})

public class SpringBootDemoApplication {

    public static void main(String[] args) {
              SpringApplication.run(SpringBootDemoApplication.class, args);
    }
   
   
}


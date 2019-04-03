package com.gproconsulting.prestation;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@ComponentScan("com.gproconsulting.prestation")
public class SpringBootDemoApplication {

    public static void main(String[] args) {
              SpringApplication.run(SpringBootDemoApplication.class, args);
    }
   
   
}


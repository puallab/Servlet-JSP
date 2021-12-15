package com.example.servletjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class ServletjspApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServletjspApplication.class, args);
    }

}

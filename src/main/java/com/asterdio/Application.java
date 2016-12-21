package com.asterdio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Admin on 12/20/2016.
 */

@RestController
@SpringBootApplication
public class Application {
    @RequestMapping("/hello")
    public String helloWorld(){
        return "hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}

package com.javaguides.springboot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/Hello")
    public String Welcome() {
        String welcomeMsg = "Hello World";
        return welcomeMsg;
    }
}

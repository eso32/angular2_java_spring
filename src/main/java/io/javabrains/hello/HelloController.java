package io.javabrains.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHay() {
        return "Hay";
    }

    @RequestMapping("/hello-obj")
    public Greeting sayHayObj() {
        Greeting newGreeting = new Greeting("Test bicz", 12);
        return newGreeting;
    }
}

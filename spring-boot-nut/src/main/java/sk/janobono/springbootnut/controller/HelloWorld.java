package sk.janobono.springbootnut.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloWorld {

    @GetMapping
    public String hello() {
        return "Hello I am spring boot nut ;)";
    }
}

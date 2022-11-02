package org.example.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auhtor llm
 * @data 2022/10/28 14:30
 */
@RestController
public class HelloWorldRestController {

    @GetMapping(value = "/hello-world")
    public String helloWorld(){
        return "hello,world";
    }
}

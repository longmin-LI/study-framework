package org.example.web.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * @auhtor llm
 * @data 2022/9/15 19:33
 */
@ControllerAdvice(assignableTypes = HelloWorldController.class)
public class HelloWorldControllerAdvice {

    @ModelAttribute("message")
    public String message(){
        return "hello, world";
    }

}

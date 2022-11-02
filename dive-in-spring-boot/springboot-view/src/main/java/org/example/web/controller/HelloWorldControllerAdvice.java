package org.example.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @auhtor llm
 * @data 2022/10/27 16:12
 */
@ControllerAdvice(assignableTypes = HelloWorldController.class)
public class HelloWorldControllerAdvice {

    @ModelAttribute("message")
    public String message(){
        return "hello, world";
    }

    @ModelAttribute("Language")
    public String acceptLanguage(@RequestHeader("Accept-Language") String acceptLanguage){
        return acceptLanguage;
    }

    @ModelAttribute("JSESSIONID")
    public String jsessionId(@CookieValue(value = "JSESSIONID", required = false) String jsessionId){
        return jsessionId;
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> onException(Throwable throwable){
        return ResponseEntity.ok(throwable.getMessage());
    }

}

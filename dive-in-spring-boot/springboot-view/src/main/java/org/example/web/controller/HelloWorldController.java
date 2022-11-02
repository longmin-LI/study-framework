package org.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * HelloWorld {@link org.springframework.stereotype.Controller}
 * @auhtor llm
 * @data 2022/10/27 14:37
 */
@Controller
public class HelloWorldController {
    //这里需要注意：有时候这个参数如果你不想携带了，最好用required=false，并且可以通过设置一个defaultValue，来避免出错
    @RequestMapping("/")
    public String index(@RequestParam(required = false,defaultValue = "0") int value, Model model){
        return "index";
    }

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "hello-world"; //View逻辑名称
    }

    @ModelAttribute("message")
    public String message(){
        return "Hello, world";
    }
}

package org.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auhtor llm
 * @data 2022/9/15 15:11
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String index(@RequestHeader("Accept-Language") String acceptLanguage, @CookieValue("JSESSIONID") String cookie, Model model){
//        model.addAttribute("message","hello, world");
        model.addAttribute("Language",acceptLanguage);
        model.addAttribute("JSESSIONID",cookie);
        return "index";
    }




}

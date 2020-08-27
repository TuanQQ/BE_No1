package com.tuanqq.BE_No1.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class HelloWorld {
    @GetMapping("/helloWorld")
    public String helloWorld(){
        String string = "hello babeee";
        System.out.println("hello babeeee");
        return string;
    }
}

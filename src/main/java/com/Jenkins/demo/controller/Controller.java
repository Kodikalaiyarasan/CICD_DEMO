package com.Jenkins.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/greet")
    public String greet()
    {
        return "Hi KODI KALAIYARASAN R";
    }


    @GetMapping("/HelloSollu")
    public String Hello()
    {
        return "Hello GSOC 2027!!!!!";
    }

}

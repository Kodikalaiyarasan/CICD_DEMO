package com.Jenkins.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @GetMapping("/Status")
    public String Status()
    {
        return "Status Successfull !!!";
    }

    @GetMapping("/")
    public List<String> avail()
    {
        List<String> list = new ArrayList<>();

        list.add("/greet");
        list.add("/HelloSollu");
        list.add("/Status");

        return list;
    }


}

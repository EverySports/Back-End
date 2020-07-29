package com.everysports.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/*")
@Log4j
public class controller {
    @RequestMapping()
    public String test2(){
        return "Hello";
    }

    @GetMapping("test")
    public @ResponseBody String test(){
        return "Spring + Maven";
    }

}

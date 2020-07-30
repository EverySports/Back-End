package com.everysports.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Log4j
public class HomeController {

    @RequestMapping()
    public String home(){
        return "Wellcom!!";
    }

    @GetMapping("hidden")
    public @ResponseBody String hidden(){
        log.trace("Hidden Test");
        return "Success";
    }

}

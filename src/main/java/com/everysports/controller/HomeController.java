package com.everysports.controller;

import com.everysports.domain.UserVO;
import lombok.extern.log4j.Log4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j
@RequestMapping("/*")
public class HomeController {

    @GetMapping("test")
    public @ResponseBody String test() {
        log.info("되냐??");

        return "Spring + Maven";
    }


}

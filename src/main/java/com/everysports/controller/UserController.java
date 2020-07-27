package com.everysports.controller;

import com.everysports.domain.UserVO;
import com.everysports.service.UserService;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/*")
@Log4j
public class UserController {

    @Setter(onMethod_=@Autowired)
    private UserService userService;

    @GetMapping(value = "/",
            produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public ResponseEntity<UserVO> selectUser(){
        return new ResponseEntity<>(userService.selectUser(), HttpStatus.OK);
    }
}

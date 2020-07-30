package com.everysports.controller;

import com.everysports.domain.NewClassVO;
import com.everysports.service.NewClassService;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/every/newclass/*")
@Log4j
public class NewClassController {
    @Setter(onMethod_ = @Autowired)
    private NewClassService newClassService;

    @GetMapping(value = "/",
            produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public ResponseEntity<List<NewClassVO>> selectNewClass(){
        return new ResponseEntity<>(newClassService.selectNewClass(), HttpStatus.OK);
    }
}

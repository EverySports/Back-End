package com.everysports.controller;

import com.everysports.domain.ClassVO;
import com.everysports.service.ClassService;
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
@RequestMapping("/class/*")
@Log4j
public class ClassController {
    @Setter(onMethod_ = @Autowired)
    private ClassService classService;

    @GetMapping(value = "/",
            produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public ResponseEntity<List<ClassVO>> selectClass(){
        return new ResponseEntity<>(classService.selectClass(), HttpStatus.OK);
    }
}

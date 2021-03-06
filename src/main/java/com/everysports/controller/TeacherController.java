package com.everysports.controller;

import com.everysports.domain.TeacherVO;
import com.everysports.service.TeacherService;
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

import java.util.List;

@RestController
@RequestMapping("/teacher/*")
@Log4j
public class TeacherController {
    @Setter(onMethod_=@Autowired)
    private TeacherService teacherService;

    @GetMapping(value = "/",
            produces = {
                    MediaType.APPLICATION_JSON_UTF8_VALUE})
    public ResponseEntity<List<TeacherVO>> selectUser(){
        return new ResponseEntity<>(teacherService.selectTeacher(), HttpStatus.OK);
    }

}

package com.everysports.controller;

import com.everysports.domain.TeacherInfoVO;
import com.everysports.service.TeacherInfoService;
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
@RequestMapping("/teacherinfo/*")
@Log4j
public class TeacherInfoController {
    @Setter(onMethod_ = @Autowired)
    private TeacherInfoService teacherInfoService;

    @GetMapping(value = "/{teacher_ID}", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public ResponseEntity<TeacherInfoVO> selectTeacherInfo(@PathVariable Long teacher_ID){
        return new ResponseEntity<>(teacherInfoService.selectTeacher(teacher_ID), HttpStatus.OK);
    }
}

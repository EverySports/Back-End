package com.everysports.controller;

import com.everysports.domain.ClassInfoVO;
import com.everysports.service.ClassInfoService;
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
@RequestMapping("/classinfo/*")
@Log4j
public class ClassInfoController {
    @Setter(onMethod_ = @Autowired)
    private ClassInfoService classInfoService;

    @GetMapping(value = "/{class_ID}", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public ResponseEntity<ClassInfoVO> selectClassInfo(@PathVariable Long class_ID){
        return new ResponseEntity<>(classInfoService.selectClassInfo(class_ID), HttpStatus.OK);
    }
}

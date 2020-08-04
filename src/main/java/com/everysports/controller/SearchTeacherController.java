package com.everysports.controller;

import com.everysports.domain.SearchTeacherVO;
import com.everysports.service.SearchTeacherService;
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
@RequestMapping("/search/teacher/*")
@Log4j
public class SearchTeacherController {
    @Setter(onMethod_ = @Autowired)
    private SearchTeacherService searchTeacherService;

    @GetMapping(value = "/{class_Category}",
            produces = {
                    MediaType.APPLICATION_JSON_UTF8_VALUE
            })
    public ResponseEntity<List<SearchTeacherVO>> selectSearchClass(@PathVariable("class_Category") Long class_Category){
        return new ResponseEntity<>(searchTeacherService.selectSearchTeacher(class_Category), HttpStatus.OK);
    }
}

package com.everysports.controller;

import com.everysports.domain.SearchClassVO;
import com.everysports.service.SearchClassService;
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
@RequestMapping("/search/class/*")
@Log4j
public class SearchClassController {
    @Setter(onMethod_ = @Autowired)
    private SearchClassService searchClassService;

    @GetMapping(value = "/{class_Category}",
            produces = {
                    MediaType.APPLICATION_JSON_UTF8_VALUE
            })
    public ResponseEntity<List<SearchClassVO>> selectSearchClass(@PathVariable("class_Category") Long class_Category){
        return new ResponseEntity<>(searchClassService.selectSearchClass(class_Category), HttpStatus.OK);
    }
}

package com.everysports.controller;

import com.everysports.domain.HotClassVO;
import com.everysports.service.HotClassService;
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
@RequestMapping("/every/hotclass/*")
@Log4j
public class HotClassController {
    @Setter(onMethod_ = @Autowired)
    private HotClassService hotClassService;

    @GetMapping(value = "/",
                produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public ResponseEntity<List<HotClassVO>> selectHotClass(){
        return new ResponseEntity<>(hotClassService.selectHotClass(), HttpStatus.OK);
    }
}

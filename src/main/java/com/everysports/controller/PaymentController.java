package com.everysports.controller;

import com.everysports.domain.PaymentVO;
import com.everysports.service.PaymentService;
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
@RequestMapping("/payment/*")
@Log4j
public class PaymentController {
    @Setter(onMethod_ = @Autowired)
    private PaymentService paymentService;

    @GetMapping(value="/{teacher_ID}&{class_ID}",
            produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public ResponseEntity<PaymentVO> selectPayment(@PathVariable Long class_ID,
                                                   @PathVariable Long teacher_ID){
        return new ResponseEntity<>(paymentService.selectPayment(teacher_ID, class_ID), HttpStatus.OK);
    }
}

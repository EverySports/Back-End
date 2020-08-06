package com.everysports.service;

import com.everysports.domain.PaymentVO;
import com.everysports.mapper.PaymentMapper;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService{
    @Setter(onMethod_ = @Autowired)
    private PaymentMapper paymentMapper;

    @Override
    public PaymentVO selectPayment(Long teacher_ID, Long class_ID) {
        PaymentVO paymentVO = new PaymentVO();
        paymentVO.setTeacherScheduleVOList(paymentMapper.selectTeacherSchedule(teacher_ID));
        paymentVO.setUserScheduleVOList(paymentMapper.selectUserSchedule(class_ID));
        return paymentVO;
    }
}

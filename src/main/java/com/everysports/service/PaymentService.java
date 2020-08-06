package com.everysports.service;

import com.everysports.domain.PaymentVO;

public interface PaymentService {
    public PaymentVO selectPayment(Long teacher_ID, Long class_ID);
}

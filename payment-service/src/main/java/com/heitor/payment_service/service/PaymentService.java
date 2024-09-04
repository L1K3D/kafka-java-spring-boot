package com.heitor.payment_service.service;

import com.heitor.payment_service.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
    
}

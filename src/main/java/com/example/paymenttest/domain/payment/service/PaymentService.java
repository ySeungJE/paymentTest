package com.example.paymenttest.domain.payment.service;

import com.example.paymenttest.web.dto.PaymentCallbackRequest;
import com.example.paymenttest.web.dto.RequestPayDto;
import com.siot.IamportRestClient.response.IamportResponse;
import com.siot.IamportRestClient.response.Payment;

public interface PaymentService {
    // 결제 요청 데이터 조회
    RequestPayDto findRequestDto(String orderUid);
    // 결제 검증(콜백)
    IamportResponse<Payment> paymentByCallback(PaymentCallbackRequest request);
}

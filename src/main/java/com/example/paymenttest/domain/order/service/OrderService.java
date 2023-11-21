package com.example.paymenttest.domain.order.service;

import com.example.paymenttest.domain.member.Member;
import com.example.paymenttest.domain.order.Order;

public interface OrderService {
    Order autoOrder(Member member); // 자동 주문
}

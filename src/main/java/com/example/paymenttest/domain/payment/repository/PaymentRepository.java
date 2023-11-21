package com.example.paymenttest.domain.payment.repository;

import com.example.paymenttest.domain.payment.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}

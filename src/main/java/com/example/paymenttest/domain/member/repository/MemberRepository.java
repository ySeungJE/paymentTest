package com.example.paymenttest.domain.member.repository;

import com.example.paymenttest.domain.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}

package com.example.likegram.boundedContext.member.repository;

import com.example.likegram.boundedContext.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository <Member, Long>{
    Optional<Member> findByUsername(String username);
}

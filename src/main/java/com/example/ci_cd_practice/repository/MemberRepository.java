package com.example.ci_cd_practice.repository;

import com.example.ci_cd_practice.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}

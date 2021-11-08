package com.school.project.CDE.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.project.CDE.Entity.MemberAccount

public interface MemberRepository extends JpaRepository<MemberAccount, Long> {
    List<MemberAccount> findAll();
}

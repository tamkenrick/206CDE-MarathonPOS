package com.school.project.CDE.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.school.project.CDE.Entity.MemberAccount;

@Repository
public class MemberDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addMember(MemberAccount memberAccount) {
        
    }
}

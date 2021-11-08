package com.school.project.CDE.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.project.CDE.Entity.MemberAccount;
import com.school.project.CDE.Dao.MemberDao;

@Service
public class MemberService {
    @Autowired
    MemberDao memberDao;
    public void addMember(MemberAccount memberAccount) {
        memberDao.addMember(memberAccount);
    }
}

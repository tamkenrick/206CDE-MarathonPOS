package com.school.project.CDE.Controller;

import com.school.project.CDE.Dao.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Kenrick Tam
 * @date 03/11/2021 7:07 下午
 */
@Controller
public class LoginController {
    @RequestMapping
    public String login(){
        return "login";
    }

    @Autowired
    MemberRepository memberRepository;


}

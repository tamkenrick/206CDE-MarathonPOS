package com.school.project.CDE.Controller;

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
}

package com.school.project.CDE.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {
    @GetMapping("menu")
    public String menu(){
        return "Menu.html";
    }
}

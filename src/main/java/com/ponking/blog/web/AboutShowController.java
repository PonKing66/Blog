package com.ponking.blog.web;/*
@author Ponking
@date 2019/12/30--16:05
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutShowController {

    @GetMapping("/about")
    public String about(){
        return "about";
    }
}

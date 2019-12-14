package com.ponking.blog.web.admin;/*
@author Ponking
@date 2019/12/9--17:53
*/


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class BlogController {

    @GetMapping("/blogs")
    public String blogs(){
        return "admin/blogs";
    }
}

package com.ponking.blog.web;/*
@author Ponking
@date 2019/12/8--20:11
*/

import com.ponking.blog.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {

    //测试
    @GetMapping("/")
    public String index() {
        System.out.println("-----------index--------------");
        return "index";
    }

    @GetMapping("/blog")
    public String blog(){
        return "blog";
    }
}

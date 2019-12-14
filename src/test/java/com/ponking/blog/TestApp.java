package com.ponking.blog;/*
@author Ponking
@date 2019/12/11--13:22
*/

import com.ponking.blog.po.Type;
import org.junit.Test;

public class TestApp {
    
    @Test
    public void demoTest(){
        A t = new A();
        System.out.println(t.name);
    }

    class A{
        private String name;
        private int id;
    }

}

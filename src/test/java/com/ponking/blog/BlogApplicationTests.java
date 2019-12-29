package com.ponking.blog;

import com.ponking.blog.dao.UserRepository;
import com.ponking.blog.po.User;
import com.ponking.blog.web.admin.LoginController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void contextLoads() {
        User user = userRepository.findByUsernameAndPassword("ponking","11");
        System.out.println(user);
    }


    @Test
    public void TestApp(){
        String aa = "aaa";
        String bb = "aaa";
        System.out.println(aa.toString());
        System.out.println(bb);

    }

}

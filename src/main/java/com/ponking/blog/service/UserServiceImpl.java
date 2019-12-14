package com.ponking.blog.service;/*
@author Ponking
@date 2019/12/9--12:43
*/

import com.ponking.blog.dao.UserRepository;
import com.ponking.blog.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User checkUser(String username, String password) {
       User user =userRepository.findByUsernameAndPassword(username,password);
       return user;
    }
}

package com.ponking.blog.service;/*
@author Ponking
@date 2019/12/9--12:42
*/

import com.ponking.blog.po.User;

public interface UserService {
    User checkUser(String username , String password);
}

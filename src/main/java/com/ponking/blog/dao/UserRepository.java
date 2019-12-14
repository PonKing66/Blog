package com.ponking.blog.dao;/*
@author Ponking
@date 2019/12/9--12:44
*/

import com.ponking.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsernameAndPassword(String username,String password);
}

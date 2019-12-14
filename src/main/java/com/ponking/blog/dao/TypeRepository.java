package com.ponking.blog.dao;/*
@author Ponking
@date 2019/12/9--23:45
*/

import com.ponking.blog.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type, Long> {
    Type findByName(String name);
}

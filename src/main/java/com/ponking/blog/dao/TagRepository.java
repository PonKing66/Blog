package com.ponking.blog.dao;/*
@author Ponking
@date 2019/12/11--9:03
*/

import com.ponking.blog.po.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag,Long> {

    Tag findByName(String name);
}

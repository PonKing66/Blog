package com.ponking.blog.dao;/*
@author Ponking
@date 2019/12/15--0:19
*/

import com.ponking.blog.po.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,Long> {
}

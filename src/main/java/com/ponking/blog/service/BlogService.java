package com.ponking.blog.service;/*
@author Ponking
@date 2019/12/15--0:14
*/

import com.ponking.blog.NotFoundException;
import com.ponking.blog.po.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BlogService {
    Blog getBlog(Long id);

    Page<Blog> listBlog(Pageable pageable,Blog blog);

    Blog saveBlog(Blog blog);

    Blog updateBlog(Long id,Blog blog) throws NotFoundException;

    void deleteBlog(Long id);
}

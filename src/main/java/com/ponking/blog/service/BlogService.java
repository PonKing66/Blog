package com.ponking.blog.service;/*
@author Ponking
@date 2019/12/15--0:14
*/

import com.ponking.blog.NotFoundException;
import com.ponking.blog.po.Blog;
import com.ponking.blog.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface BlogService {
    Blog getBlog(Long id);

    Blog getAndMarkdownConvertHtml(Long id) throws NotFoundException;

    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    Page<Blog> listBlog(Pageable pageable);

    Page<Blog> listBlog(Long tagId,Pageable pageable);

    Page<Blog> listBlog(String query,Pageable pageable);

    Map<String,List<Blog>> archivesBlog();

    Long countBlog();

    Blog saveBlog(Blog blog);

    List<Blog> listRecommendBlogTop(Integer size);

    Blog updateBlog(Long id,Blog blog) throws NotFoundException;

    void deleteBlog(Long id);
}

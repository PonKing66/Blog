package com.ponking.blog.service;/*
@author Ponking
@date 2019/12/15--0:18
*/

import com.ponking.blog.NotFoundException;
import com.ponking.blog.dao.BlogRepository;
import com.ponking.blog.po.Blog;
import com.sun.crypto.provider.BlowfishKeyGenerator;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Blog getBlog(Long id) {
        return blogRepository.getOne(id);
    }

    @Override
    public Page<Blog> listBlog(Pageable pageable, Blog blog) {
        return null;
    }

    @Override
    public Blog saveBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public Blog updateBlog(Long id,Blog blog) throws NotFoundException {
        Blog b = blogRepository.getOne(id);
        if(b==null){
            throw new NotFoundException("该博客不存在！");
        }
        BeanUtils.copyProperties(blog,b);
        blogRepository.save(b);
        return null;
    }

    @Override
    public void deleteBlog(Long id) {
        blogRepository.deleteById(id);
    }
}

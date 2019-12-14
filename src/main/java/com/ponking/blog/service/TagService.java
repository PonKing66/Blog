package com.ponking.blog.service;/*
@author Ponking
@date 2019/12/11--9:00
*/

import com.ponking.blog.NotFoundException;
import com.ponking.blog.po.Tag;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TagService {
    Tag saveTag(Tag tag);

    Tag  getTag(Long id);

    Tag  getTagByName(String name);

    Page<Tag> listTag(Pageable pageable);

    Tag  updateTag(Long id,Tag  tag) throws NotFoundException;

    void deleteTag(Long id);
}

package com.ponking.blog.service;/*
@author Ponking
@date 2019/12/9--23:42
*/

import com.ponking.blog.NotFoundException;
import com.ponking.blog.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TypeService {
    Type saveType(Type type);

    Type getType(Long id);

    Type getTypeByName(String name);

    Page<Type> listType(Pageable pageable);

    List<Type> listType();

    List<Type> listTypeTop(Integer size);

    Type updateType(Long id,Type type) throws NotFoundException;

    void deleteType(Long id);
}

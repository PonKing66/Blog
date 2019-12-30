package com.ponking.blog.service;/*
@author Ponking
@date 2019/12/29--20:41
*/

import com.ponking.blog.po.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> listCommentByBlogId(Long blogId);
    Comment saveComment(Comment comment);
}

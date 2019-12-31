package com.ponking.blog.util;/*
@author Ponking
@date 2019/12/31--9:48
*/

import com.ponking.blog.po.Comment;

public class MailInfo {

    public static String getSubject(Comment comment){
        String title = comment.getBlog().getTitle();
        return "关于文章:"+title+"的最新评论";
    }


    public static String getContent(Comment comment){
        return "用户："+comment.getNickname()+
                "\n邮箱："+comment.getEmail()+
                "\n回复内容："+comment.getContent();
    }
}

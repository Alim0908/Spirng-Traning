package com.cydeo;

import com.cydeo.config.CommentConfig;
import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentApplication {
    public static void main(String[] args) {

        Comment comment =new Comment();
        comment.setAuthor("Alim");
        comment.setText(" Hello");

        ApplicationContext context=new AnnotationConfigApplicationContext(CommentConfig.class);
        CommentService commentService=context.getBean(CommentService.class);

        commentService.publishComment(comment);



    }
}

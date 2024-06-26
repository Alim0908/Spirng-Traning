package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;

import com.cydeo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    @Autowired// and we can not write @autowire if we have only one constructor in a class
    public CommentService(CommentRepository commentRepository, @Qualifier("Email") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }//Autowired Annotation: The @Autowired annotation on the constructor tells Spring to automatically inject
    // instances of CommentRepository and CommentNotificationProxy when creating an instance of CommentService.

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);// save in the database
        commentNotificationProxy.sendComment(comment);//sen email

    }
}

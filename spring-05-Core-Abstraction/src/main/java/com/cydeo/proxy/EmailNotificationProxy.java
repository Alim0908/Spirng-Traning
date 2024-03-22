package com.cydeo.proxy;

import com.cydeo.model.Comment;
import org.springframework.stereotype.Component;


@Component
public class EmailNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification"+comment.getText());
    }
}

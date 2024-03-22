package com.cydeo.repository;

import com.cydeo.model.Comment;

public class DBCCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment :"+comment.getText());
    }
}

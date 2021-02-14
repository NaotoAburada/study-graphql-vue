package com.example.demo.model;

import com.example.demo.model.value.BlogId;
import java.util.List;
import com.example.demo.types.Comment;

public interface CommentRepository {
    List<Comment> getComments(BlogId blogId);
    // RegistBookResponse registBook(AuthorId authorId, Name name);
}

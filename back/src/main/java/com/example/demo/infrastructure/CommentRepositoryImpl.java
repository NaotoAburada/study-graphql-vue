package com.example.demo.infrastructure;

import com.example.demo.infrastructure.mapper.CommentMapper;
import com.example.demo.model.CommentFactory;
import com.example.demo.model.CommentRepository;
import com.example.demo.model.value.BlogId;
import java.util.List;
import lombok.AllArgsConstructor;
// import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.example.demo.types.Comment;

@Component
@AllArgsConstructor
// @Slf4j
public class CommentRepositoryImpl implements CommentRepository {
    private final CommentFactory commentFactory;
    private final CommentMapper commentMapper;

    @Override
    public List<Comment> getComments(BlogId blogId) {
        return commentFactory.create(commentMapper.getComments(blogId.getValue()));
    }
}

package com.example.demo.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.demo.infrastructure.CommentRepositoryImpl;
import com.example.demo.model.value.BlogId;
import com.example.demo.types.Blog;
import com.example.demo.types.Comment;
import java.util.List;
import lombok.AllArgsConstructor;
// import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
// @Slf4j
public class CommentResolver implements GraphQLResolver<Blog> {
    private final CommentRepositoryImpl commentRepositoryImpl;

    public List<Comment> comments(Blog blog) {
        BlogId blogId = BlogId.of(blog.getId());
        return commentRepositoryImpl.getComments(blogId);
    }
}

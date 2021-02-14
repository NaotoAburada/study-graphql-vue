package com.example.demo.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.infrastructure.CommentRepositoryImpl;
import com.example.demo.types.RegistCommentInput;
import java.util.Objects;
import lombok.AllArgsConstructor;
// import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.List;
import com.example.demo.types.Comment;
import com.example.demo.model.value.BlogId;
import com.example.demo.model.value.Id;

@Component
@AllArgsConstructor
// @Slf4j
public class CommentMutationResolver implements GraphQLMutationResolver {
    private final CommentRepositoryImpl commentRepositoryImpl;

    public List<Comment> registComment(RegistCommentInput registCommentInput) {
        BlogId blogId = BlogId.of(Integer.valueOf(registCommentInput.getBlogId()));
        return commentRepositoryImpl.registComment(blogId,
                    registCommentInput.getName(),
                    registCommentInput.getComment());
    }
}

package com.example.demo.model;

import com.example.demo.infrastructure.mapper.CommentEntity;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import com.example.demo.types.Comment;
import java.time.format.DateTimeFormatter;

@Component
// @AllArgsConstructor
public class CommentFactory {

    /**
     * create Comments for CommentEntities
     * @param commentEntities CommentEntities
     * @return comments
     */
    public List<Comment> create(List<CommentEntity> commentEntities) {
        List<Comment> comments = new ArrayList<>();
        for (CommentEntity commentEntity : commentEntities) {
            Comment comment = Comment.builder()
                .id(commentEntity.getId())
                .name(commentEntity.getName())
                .comment(commentEntity.getComment())
                .postDate(commentEntity.getPost_date().format(DateTimeFormatter.ofPattern("yyyy/MM/dd")))
                .build();
            comments.add(comment);
        }

        return comments;
    }
}

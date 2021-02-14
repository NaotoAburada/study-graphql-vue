package com.example.demo.infrastructure.mapper;

import java.time.LocalDate;
import java.util.List;
import lombok.Data;

@Data
public class BlogEntity {
    private int id;
    private String title;
    private String overview;
    private LocalDate post_date;
    private String blog_body;
    private List<CommentEntity> comments;
}

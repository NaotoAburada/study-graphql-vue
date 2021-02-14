package com.example.demo.infrastructure.mapper;

import java.time.LocalDate;
import java.util.List;
import lombok.Data;

@Data
public class CommentEntity {
    private int id;
    private String name;
    private LocalDate post_date;
    private String comment;
    private String bolg_id;
    private BlogEntity blogEntity;
}

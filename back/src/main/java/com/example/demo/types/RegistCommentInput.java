package com.example.demo.types;

import java.sql.Date;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RegistCommentInput {
    private String name;
    private String comment;
    private int blogId;
}

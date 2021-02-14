package com.example.demo.types;

import java.sql.Date;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Comment {
    private int id;
    private String name;
    private String comment;
    private String postDate;
    private String blogId;
}

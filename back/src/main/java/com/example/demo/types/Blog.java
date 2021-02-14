package com.example.demo.types;

import java.sql.Date;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Blog {
    private int id;
    private String title;
    private String overview;
    private String postDate;
    private String blogBody;
}

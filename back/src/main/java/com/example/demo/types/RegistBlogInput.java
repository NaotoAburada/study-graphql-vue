package com.example.demo.types;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RegistBlogInput {
    private String title;
    private String overview;
    private String blogBody;
    private boolean temporarilySaved;
}

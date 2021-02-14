package com.example.demo.model;

import java.util.List;

import com.example.demo.model.value.Id;
import com.example.demo.types.Blog;

public interface BlogRepository {
    Blog getBlogById(Id id);
    List<Blog> getBlogList();
    List<Blog> registBlog(String title,
        String overview, 
        String blogBody,
        boolean temporarilySaved);
}

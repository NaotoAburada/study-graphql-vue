package com.example.demo.model;

import com.example.demo.infrastructure.mapper.BlogEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.stereotype.Component;
import com.example.demo.types.Blog;
import java.time.format.DateTimeFormatter;

@Component
public class BlogFactory {

    /**
     * create Blog for BlogEntity
     * @param blogEntity BlogEntity
     * @return Blog
     */
    public Blog create(BlogEntity blogEntity) {
        if (Objects.isNull(blogEntity)) {
            return null;
        }

        return Blog.builder()
            .id(blogEntity.getId())
            .title(blogEntity.getTitle())
            .overview(blogEntity.getOverview())
            .postDate(blogEntity.getPost_date().format(DateTimeFormatter.ofPattern("yyyy/MM/dd")))
            .blogBody(blogEntity.getBlog_body())
            .build();
    }

    /**
     * create Blog List for BlogEntity
     * @param blogEntityList List<BlogEntity>
     * @return Blog List
     */
    public List<Blog> create(List<BlogEntity> blogEntityList) {

        List<Blog> list = new ArrayList<Blog>();

        if (Objects.isNull(blogEntityList)) {
            return null;
        }

        for (BlogEntity blogEntity : blogEntityList) {
            list.add(Blog.builder()
                .id(blogEntity.getId())
                .title(blogEntity.getTitle())
                .overview(blogEntity.getOverview())
                .postDate(blogEntity.getPost_date().format(DateTimeFormatter.ofPattern("yyyy/MM/dd")))
                .blogBody(blogEntity.getBlog_body())
                .build());
        }

        return list;
    }
}

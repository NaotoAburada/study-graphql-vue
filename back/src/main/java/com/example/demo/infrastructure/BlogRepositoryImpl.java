package com.example.demo.infrastructure;

import java.util.List;

import com.example.demo.infrastructure.mapper.BlogMapper;
import com.example.demo.model.BlogFactory;
import com.example.demo.model.BlogRepository;
import com.example.demo.model.value.Id;
import com.example.demo.model.value.Name;
import com.example.demo.types.Blog;
import lombok.AllArgsConstructor;
// import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
// @Slf4j
public class BlogRepositoryImpl implements BlogRepository {
    private final BlogMapper blogMapper;
    private final BlogFactory blogFactory;

    @Override
    public Blog getBlogById(Id id) {
        return blogFactory.create(blogMapper.getBlogById(id.getValue()));
    }

    @Override
    public List<Blog> getBlogList() {
        return blogFactory.create(blogMapper.getBlogList());
    }
}

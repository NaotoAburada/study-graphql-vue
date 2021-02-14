package com.example.demo.resolvers;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.infrastructure.BlogRepositoryImpl;

import com.example.demo.model.value.Id;
import com.example.demo.model.value.Name;
import com.example.demo.types.Blog;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BlogQueryResolver implements GraphQLQueryResolver {
    private final BlogRepositoryImpl blogRepositoryImpl;

    public Blog getBlogById(int id) {
        Id idValue = Id.of(id);
        return blogRepositoryImpl.getBlogById(idValue);
    }

    public List<Blog> getBlogList() {
        return blogRepositoryImpl.getBlogList();
    }

}

package com.example.demo.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.infrastructure.BlogRepositoryImpl;
import com.example.demo.types.RegistBlogInput;
import lombok.AllArgsConstructor;
// import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.List;
import com.example.demo.types.Blog;

@Component
@AllArgsConstructor
// @Slf4j
public class BlogMutationResolver implements GraphQLMutationResolver {
    private final BlogRepositoryImpl blogRepositoryImpl;

    public List<Blog> registBlog(RegistBlogInput registBlogInput) {
        return blogRepositoryImpl.registBlog(registBlogInput.getTitle(), 
                    registBlogInput.getOverview(), 
                    registBlogInput.getBlogBody(), 
                    registBlogInput.isTemporarilySaved());
    }
}

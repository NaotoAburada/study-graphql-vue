package com.example.demo.resolvers;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.infrastructure.AuthorRepositoryImpl;

import com.example.demo.model.value.Id;
import com.example.demo.model.value.Name;
import com.example.demo.types.Author;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AuthorQueryResolver implements GraphQLQueryResolver {
    private final AuthorRepositoryImpl authorRepositoryImpl;

    public Author getAuthorById(int id) {
        Id idValue = Id.of(id);
        return authorRepositoryImpl.getAuthorById(idValue);
    }

    public List<Author> getAuthorByName(String name) {
        Name nameValue = Name.of(name);
        return authorRepositoryImpl.getAuthorByName(nameValue);
    }

    public List<Author> getAuthorByMultiConditions(int id, String name) {
        Id idValue = Id.of(id);
        Name nameValue = Name.of(name);
        return authorRepositoryImpl.getAuthorByMultiConditions(idValue, nameValue);
    }

    
}

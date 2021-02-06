package com.example.demo.model;

import com.example.demo.infrastructure.mapper.AuthorEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.stereotype.Component;
import com.example.demo.types.Author;

@Component
public class AuthorFactory {

    /**
     * create Author for AuthorEntity
     * @param authorEntity authorEntity
     * @return Author
     */
    public Author create(AuthorEntity authorEntity) {
        if (Objects.isNull(authorEntity)) {
            return null;
        }

        return Author.builder().id(authorEntity.getId()).name(authorEntity.getName()).build();
    }

    /**
     * create Author List for AuthorEntity
     * @param authorEntityList List<authorEntity>
     * @return Author List
     */
    public List<Author> create(List<AuthorEntity> authorEntityList) {

        List<Author> list = new ArrayList<Author>();

        if (Objects.isNull(authorEntityList)) {
            return null;
        }

        for (AuthorEntity authorEntity : authorEntityList) {
            list.add(Author.builder().id(authorEntity.getId()).name(authorEntity.getName()).build());
        }

        return list;
    }
}

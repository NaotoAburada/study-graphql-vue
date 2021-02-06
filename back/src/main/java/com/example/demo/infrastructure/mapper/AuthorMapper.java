package com.example.demo.infrastructure.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AuthorMapper {
    AuthorEntity getAuthorById(@Param("id") int id);
    List<AuthorEntity> getAuthorByName(@Param("name") String name);
    List<AuthorEntity> getAuthorByMultiConditions(@Param("id") int id, @Param("name") String name);
    void registAuthor(@Param("name") String name);
}

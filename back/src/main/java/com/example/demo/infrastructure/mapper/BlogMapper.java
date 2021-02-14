package com.example.demo.infrastructure.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BlogMapper {
    BlogEntity getBlogById(@Param("id") int id);
    List<BlogEntity> getBlogList();
}

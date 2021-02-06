package com.example.demo.model;

import java.util.List;

import com.example.demo.model.value.Id;
import com.example.demo.model.value.Name;
import com.example.demo.types.Author;
import com.example.demo.types.RegistAuthorResponse;

public interface AuthorRepository {
    Author getAuthorById(Id id);
    List<Author> getAuthorByName(Name name);

    List<Author> getAuthorByMultiConditions(Id id, Name name);

    RegistAuthorResponse registAuthor(Name name);
}

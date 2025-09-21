package com.springframework.spring6webapp.service;

import com.springframework.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();

}

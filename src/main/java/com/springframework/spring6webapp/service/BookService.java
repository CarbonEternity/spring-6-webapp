package com.springframework.spring6webapp.service;

import com.springframework.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}

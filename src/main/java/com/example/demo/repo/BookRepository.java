package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Book;

/**
 * Created by jt on 12/23/19.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
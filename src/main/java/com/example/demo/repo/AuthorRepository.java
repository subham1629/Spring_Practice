package com.example.demo.repo;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Author;

/**
 * Created by jt on 12/23/19.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
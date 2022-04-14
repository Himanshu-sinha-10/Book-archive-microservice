package com.himanshu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.himanshu.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long> {

}

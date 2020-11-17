package com.demo.books.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.books.data.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	List<Book> findAll();
}

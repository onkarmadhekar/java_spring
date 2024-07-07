package com.onkarmadhekar.webapp.repositories;

import com.onkarmadhekar.webapp.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}

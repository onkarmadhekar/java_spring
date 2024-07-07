package com.onkarmadhekar.webapp.repositories;

import com.onkarmadhekar.webapp.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}

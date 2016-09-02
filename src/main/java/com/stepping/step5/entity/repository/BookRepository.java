package com.stepping.step5.entity.repository;

import java.util.List;
import com.stepping.step5.entity.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BookRepository extends CrudRepository<Book, Integer> {
}

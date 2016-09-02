package com.stepping.step5.entity.repository;

import com.stepping.step5.entity.models.Librarian;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LibrarianRepository extends CrudRepository<Librarian, Integer> {
}

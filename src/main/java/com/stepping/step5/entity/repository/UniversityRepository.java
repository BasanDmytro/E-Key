package com.stepping.step5.entity.repository;

import com.stepping.step5.entity.models.University;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UniversityRepository extends CrudRepository<University, Integer> {

    //@Query("select u from  university u  where u.name = :name")
    //University findByName(@Param("name") String name);

    //public University findByName(String name);
}
package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

//@Repository
// NO NEED TO ADD THIS ANNOTATION SINCE
// THE IMPLEMENTATION CLASS FOR THIS INTERFACE WILL ALREADY THIS ANNOTATION
// @RepositoryRestResource(path = "members")
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByFirstName(@Param("firstName") String firstName);
}

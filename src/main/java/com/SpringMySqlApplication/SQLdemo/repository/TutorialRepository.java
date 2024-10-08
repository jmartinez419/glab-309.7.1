package com.SpringMySqlApplication.SQLdemo.repository;

import com.SpringMySqlApplication.SQLdemo.model.Tutorial;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path = "learningtutorials")
//@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long>
        // Tutorial → Entity type and Long --> primary key
{
    //   findByPublished is a custom method()
    List<Tutorial> findByPublished(boolean published);
}

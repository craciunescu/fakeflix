package com.fakeflix.system.repositories;

import org.springframework.stereotype.Repository;

import com.fakeflix.system.domain.Author;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AuthorsRepository extends JpaRepository<Author, Long> {

}

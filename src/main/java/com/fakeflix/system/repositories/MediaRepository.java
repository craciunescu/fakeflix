package com.fakeflix.system.repositories;

import org.springframework.stereotype.Repository;

import java.util.List;

import com.fakeflix.system.domain.Media;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface MediaRepository extends JpaRepository<Media, Long> {
    // TODO we need more?

    Media findById(long id);

    List<Media> findAll();

    @Query("select m from Media m where m.author.id = ?1")
    List<Media> findByAuthor(long Id);
}

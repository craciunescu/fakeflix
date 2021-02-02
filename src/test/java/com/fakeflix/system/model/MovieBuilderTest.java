package com.fakeflix.system.model;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import com.fakeflix.system.domain.Author;
import com.fakeflix.system.domain.Movie;
import com.fakeflix.system.domain.MovieBuilder;
import com.fakeflix.system.domain.Pegi;
import com.fakeflix.system.domain.Tag;

public class MovieBuilderTest {
    @Test
    void shouldInitialize() {
        final Author author = new Author("John", "Doe");

        final Movie movie = new MovieBuilder().name("FILM1").pegi(Pegi.ALLPUBLIC).tags(List.of(Tag.ACTION, Tag.HORROR))
                .author(author).build();

        assertThat(movie).isNotNull();
        assertThat(movie.getAuthor()).isNotNull();
        assertThat(movie.getPegi()).isNotNull();
        assertThat(movie.getName()).isNotBlank();
        assertThat(movie.getTags()).contains(Tag.ACTION);
        assertThat(movie.getTags()).contains(Tag.HORROR);
    }

}

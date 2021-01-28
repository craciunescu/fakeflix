package com.fakeflix.system.model;

import com.fakeflix.system.media.Movie;
import com.fakeflix.system.media.MovieBuilder;
import com.fakeflix.system.media.Pegi;
import com.fakeflix.system.media.Tag;
import com.fakeflix.system.media.Author;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

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

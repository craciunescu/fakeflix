package com.fakeflix.system.model;

import com.fakeflix.system.Movie;
import com.fakeflix.system.CourseBuilder;
import com.fakeflix.system.Pegi;
import com.fakeflix.system.Author;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class CourseBuilderTest {
    @Test
    void shouldInitialize() {
        final Author author = new Author("John", "Doe");

        final Movie movie = new CourseBuilder().name("FILM1").pegi(Pegi.ALLPUBLIC).tags(List.of("TAG1", "TAG2"))
                .author(author).build();

        assertThat(movie).isNotNull();
        assertThat(movie.getAuthor()).isNotNull();
        assertThat(movie.getPegi()).isNotNull();
        assertThat(movie.getName()).isNotBlank();
        assertThat(movie.getTags()).contains("TAG1");
        assertThat(movie.getTags()).contains("TAG2");
    }

}

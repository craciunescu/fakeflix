package com.fakeflix.system.domain.movie;

import java.util.List;

import com.fakeflix.system.domain.Author;
import com.fakeflix.system.domain.Media;
import com.fakeflix.system.domain.Tag;

public class MovieBuilder {

    // Fields
    private String       title;
    private List<Author> authors;
    private List<Tag>    tags;

    // Builder methods
    public MovieBuilder title(String title) {
        this.title = title;
        return this;
    }

    public MovieBuilder authors(List<Author> authors) {
        this.authors = authors;
        return this;
    }

    public MovieBuilder tags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    ////////////////////////////////////////////////////////////////////////////

    public Media build() {
        return new Movie(title, authors, tags);
    }

}

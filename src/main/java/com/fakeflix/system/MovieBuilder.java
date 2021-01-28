package com.fakeflix.system;

import java.util.List;

public class MovieBuilder {
    private String name;
    private Pegi pegi;
    private List<String> tags;
    private Author author;

    public MovieBuilder name(String name) {
        this.name = name;
        return this;
    }

    public MovieBuilder pegi(Pegi pegi) {
        this.pegi = pegi;
        return this;
    }

    public MovieBuilder tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public MovieBuilder author(Author author) {
        this.author = author;
        return this;
    }

    public Movie build() {
        return new BaseMovie(name, pegi, tags, author);
    }

}

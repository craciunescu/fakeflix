package com.fakeflix.system;

import java.util.List;

public class CourseBuilder {
    private String name;
    private Pegi pegi;
    private List<String> tags;
    private Author author;

    public CourseBuilder name(String name) {
        this.name = name;
        return this;
    }

    public CourseBuilder pegi(Pegi pegi) {
        this.pegi = pegi;
        return this;
    }

    public CourseBuilder tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public CourseBuilder author(Author author) {
        this.author = author;
        return this;
    }

    public Movie build() {
        return new BaseMovie(name, pegi, tags, author);
    }

}

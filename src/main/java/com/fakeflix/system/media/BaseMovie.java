package com.fakeflix.system.media;

import java.util.List;

import com.fakeflix.system.media.state.MovieState;

public class BaseMovie implements Movie {

    private String name;

    private Pegi pegi;

    private List<Tag> tags;

    private Author author;

    private MovieState state;

    public BaseMovie(String name, Pegi pegi, List<Tag> tags, Author author) {
        this.name = name;
        this.pegi = pegi;
        this.tags = tags;
        this.author = author;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Pegi getPegi() {
        return pegi;
    }

    @Override
    public List<Tag> getTags() {
        return tags;
    }

    @Override
    public Author getAuthor() {
        return author;
    }

    @Override
    public MovieState getState() {
        return state;
    }

    @Override
    public void setState(MovieState state) {
        this.state = state;
    }

    @Override
    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public void ready() {
        state.available(this);
    }

    @Override
    public void start() {
        state.start(this);
    }

    @Override
    public void finish() {
        state.finish(this);
    }

}

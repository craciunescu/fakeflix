package com.fakeflix.system.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fakeflix.system.domain.state.MovieState;

@Entity
public class BaseMovie implements Movie {

    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private Pegi pegi;

    private List<Tag> tags;

    @ManyToOne
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

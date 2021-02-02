package com.fakeflix.system.domain;

import java.util.List;

import com.fakeflix.system.domain.state.MovieState;

public interface Movie {

    String getName();

    Pegi getPegi();

    List<Tag> getTags();

    Author getAuthor();

    MovieState getState();

    void setState(MovieState state);

    void setAuthor(Author author);

    void ready();

    void start();

    void finish();

}

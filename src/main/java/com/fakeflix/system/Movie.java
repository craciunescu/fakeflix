package com.fakeflix.system;

import com.fakeflix.system.state.MovieState;
import java.util.List;

public interface Movie {

    String getName();

    Pegi getPegi();

    List<String> getTags();

    Author getAuthor();

    MovieState getState();

    void setState(MovieState state);

    void setAuthor(Author author);

    void ready();

    void start();

    void finish();

}

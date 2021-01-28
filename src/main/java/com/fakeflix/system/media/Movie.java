package com.fakeflix.system.media;

import com.fakeflix.system.media.state.MovieState;
import java.util.List;

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

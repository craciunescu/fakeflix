package com.fakeflix.system.state;

import com.fakeflix.system.Movie;

public interface MovieState {

    void available(Movie course);

    void start(Movie course);

    void finish(Movie course);

}

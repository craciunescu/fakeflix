package com.fakeflix.system.domain.state;

import com.fakeflix.system.domain.Movie;

public interface MovieState {

    void available(Movie course);

    void start(Movie course);

    void finish(Movie course);

}

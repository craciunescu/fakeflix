package com.fakeflix.system.media.state;

import com.fakeflix.system.media.Movie;

public interface MovieState {

    void available(Movie course);

    void start(Movie course);

    void finish(Movie course);

}

package com.fakeflix.system.state;

import com.fakeflix.system.Movie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FinishedState implements MovieState {
    private static final Logger logger = LoggerFactory.getLogger(FinishedState.class);

    public final String name;

    public FinishedState() {
        this.name = "FINISHED";
    }

    @Override
    public void available(Movie movie) {
        logger.error("Movie already available");
    }

    @Override
    public void start(Movie movie) {
        logger.info("Starting movie");
        movie.setState(new StartedState());
    }

    @Override
    public void finish(Movie movie) {
        logger.error("Movie already finished");
    }

}

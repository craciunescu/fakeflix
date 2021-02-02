package com.fakeflix.system.domain.state;

import com.fakeflix.system.domain.Movie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StartedState implements MovieState {
    private static final Logger logger = LoggerFactory.getLogger(FinishedState.class);

    public final String name;

    public StartedState() {
        this.name = "STARTED";
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
        logger.info("Finishing course");
        movie.setState(new FinishedState());
    }

}

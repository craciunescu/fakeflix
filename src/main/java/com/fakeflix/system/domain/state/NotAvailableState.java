package com.fakeflix.system.domain.state;

import com.fakeflix.system.domain.Movie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotAvailableState implements MovieState {

    private static final Logger logger = LoggerFactory.getLogger(FinishedState.class);

    public final String name;

    public NotAvailableState() {
        this.name = "NOTAVAILABLE";
    }

    @Override
    public void available(Movie movie) {
        logger.info("Changing Movie status to available");
        movie.setState(new AvailableState());

    }

    @Override
    public void start(Movie movie) {
        logger.error("Movie is not available yet");
    }

    @Override
    public void finish(Movie movie) {
        logger.error("Movie is not available yet");
    }

}

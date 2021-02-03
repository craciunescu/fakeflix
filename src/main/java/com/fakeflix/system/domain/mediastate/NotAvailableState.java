package com.fakeflix.system.domain.mediastate;

import com.fakeflix.system.domain.Media;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotAvailableState implements MediaState {

    private static final Logger logger = LoggerFactory.getLogger(NotAvailableState.class);

    public final String name;

    public NotAvailableState() {
        this.name = "NOTAVAILABLE";
    }

    @Override
    public void available(Media movie) {
        logger.info("Changing media status to available");
        movie.setState(new AvailableState());

    }

    @Override
    public void start(Media movie) {
        logger.error("Media is not available yet");
    }

    @Override
    public void finish(Media movie) {
        logger.error("Media is not available yet");
    }

}

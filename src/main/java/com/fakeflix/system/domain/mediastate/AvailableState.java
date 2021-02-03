package com.fakeflix.system.domain.mediastate;

import com.fakeflix.system.domain.Media;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AvailableState implements MediaState {
    private static final Logger logger = LoggerFactory.getLogger(AvailableState.class);

    public final String name;

    public AvailableState() {
        this.name = "AVAILABLE";
    }

    @Override
    public void available(Media media) {
        logger.error("Media is already available");
    }

    @Override
    public void start(Media media) {
        logger.info("Starting media");
        media.setState(new StartedState());
    }

    @Override
    public void finish(Media media) {
        logger.error("The user has not started watching yet, cannot be finished");
    }

}

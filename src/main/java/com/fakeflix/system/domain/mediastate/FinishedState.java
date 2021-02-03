package com.fakeflix.system.domain.mediastate;

import com.fakeflix.system.domain.Media;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FinishedState implements MediaState {
    private static final Logger logger = LoggerFactory.getLogger(FinishedState.class);

    public final String name;

    public FinishedState() {
        this.name = "FINISHED";
    }

    @Override
    public void available(Media media) {
        logger.error("Media already available");
    }

    @Override
    public void start(Media media) {
        logger.info("Starting media");
        media.setState(new StartedState());
    }

    @Override
    public void finish(Media media) {
        logger.error("Media already finished");
    }

}

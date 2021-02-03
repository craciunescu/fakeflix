package com.fakeflix.system.domain.mediastate;

import com.fakeflix.system.domain.Media;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StartedState implements MediaState {
    private static final Logger logger = LoggerFactory.getLogger(StartedState.class);

    public final String name;

    public StartedState() {
        this.name = "STARTED";
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
        logger.info("Finishing media");
        media.setState(new FinishedState());
    }

}

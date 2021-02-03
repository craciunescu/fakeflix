package com.fakeflix.system.domain.movie;

import java.util.List;

import com.fakeflix.system.domain.Media;
import com.fakeflix.system.domain.Tag;

public class OscarMovieDecorator extends MovieDecorator {

    public OscarMovieDecorator(Media decoratedMovie) {
        super(decoratedMovie);
        List<Tag> tags = decoratedMovie.getTags();
        boolean isOscarWinning = tags.contains(Tag.OSCAR_WINNING);
        if (!isOscarWinning) tags.add(Tag.OSCAR_WINNING);
    }
}

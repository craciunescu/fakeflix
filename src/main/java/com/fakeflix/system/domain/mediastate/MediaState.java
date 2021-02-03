package com.fakeflix.system.domain.mediastate;

import com.fakeflix.system.domain.Media;

public interface MediaState {

    void available(Media media);

    void start(Media media);

    void finish(Media media);

}

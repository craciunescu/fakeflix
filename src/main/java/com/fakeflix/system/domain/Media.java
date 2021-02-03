package com.fakeflix.system.domain;

import java.util.List;

import com.fakeflix.system.domain.mediastate.MediaState;

public interface Media {

    // Getters
    int             getID();
    String          getTitle();
    List<Author>    getAuthors();
    List<Tag>       getTags();
    MediaState      getState();

    // Setters
    void setTitle  (String          title);
    void setAuthors(List<Author>    authors);
    void setTags   (List<Tag>       tags);
    void setState  (MediaState      state);

    // State machine
    void ready();
    void start();
    void finish();
}

package com.fakeflix.system;

import com.fakeflix.system.state.MovieState;
import java.util.List;

public interface Movie {

    String getName();

    Level getLevel();

    List<String> getSubjects();

    Teacher getTeacher();

    MovieState getState();

    void setState(MovieState state);

    void setTeacher(Teacher teacher);

    void ready(Teacher teacher);

    void start();

    void finish();

}

package com.fakeflix.system;

import com.fakeflix.system.state.CourseState;
import java.util.List;

public interface Course {

    String getName();

    Level getLevel();

    List<String> getSubjects();

    Teacher getTeacher();

    CourseState getState();

    void setState(CourseState state);

    void setTeacher(Teacher teacher);

    void ready(Teacher teacher);

    void start();

    void finish();

}

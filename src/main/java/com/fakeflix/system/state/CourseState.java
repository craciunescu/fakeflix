package com.fakeflix.system.state;

import com.fakeflix.system.Course;
import com.fakeflix.system.Teacher;

public interface CourseState {

    void ready(Course course, Teacher teacher);

    void start(Course course);

    void finish(Course course);

}

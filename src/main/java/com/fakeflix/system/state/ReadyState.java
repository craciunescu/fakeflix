package com.fakeflix.system.state;

import com.fakeflix.system.Course;
import com.fakeflix.system.Teacher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReadyState implements CourseState {
    private static final Logger logger = LoggerFactory.getLogger(FinishedState.class);

    public final String name;

    public ReadyState() {
        this.name = "READY";
    }

    @Override
    public void ready(Course course, Teacher teacher) {
        logger.error("Course is already ready");
    }

    @Override
    public void start(Course course) {
        logger.info("Starting course");
        course.setState(new StartedState());
    }

    @Override
    public void finish(Course course) {
        logger.error("Course is ready, cannot finish");
    }

}

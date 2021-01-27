package com.fakeflix.system.state;

import com.fakeflix.system.Course;
import com.fakeflix.system.Teacher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StartedState implements CourseState {
    private static final Logger logger = LoggerFactory.getLogger(FinishedState.class);

    public final String name;

    public StartedState() {
        this.name = "STARTED";
    }

    @Override
    public void ready(Course course, Teacher teacher) {
        logger.error("Course is start, cannot ready");
    }

    @Override
    public void start(Course course) {
        logger.error("Course is already start");

    }

    @Override
    public void finish(Course course) {
        logger.info("Finishing course");
        course.setState(new FinishedState());
    }

}

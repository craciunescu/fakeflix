package com.fakeflix.system.state;

import com.fakeflix.system.Course;
import com.fakeflix.system.Teacher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FinishedState implements CourseState {
    private static final Logger logger = LoggerFactory.getLogger(FinishedState.class);

    public final String name;

    public FinishedState() {
        this.name = "FINISHED";
    }

    @Override
    public void ready(Course course, Teacher teacher) {
        logger.error("Course has finished, cannot ready");
    }

    @Override
    public void start(Course course) {
        logger.error("Course has finished, cannot start");
    }

    @Override
    public void finish(Course course) {
        logger.error("Course has finished");
    }

}

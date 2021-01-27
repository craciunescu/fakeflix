package com.fakeflix.system.state;

import com.fakeflix.system.Course;
import com.fakeflix.system.Teacher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PendingState implements CourseState {

    private static final Logger logger = LoggerFactory.getLogger(FinishedState.class);

    public final String name;

    public PendingState() {
        this.name = "PENDING";
    }

    @Override
    public void ready(Course course, Teacher teacher) {
        logger.info("Â¡Teacher assigned! Course is ready");
        course.setTeacher(teacher);
        course.setState(new ReadyState());

    }

    @Override
    public void start(Course course) {
        logger.error("Course is pending, cannot start");
    }

    @Override
    public void finish(Course course) {
        logger.error("Course is pending, cannot finish");
    }

}

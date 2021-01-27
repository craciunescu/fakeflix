package com.fakeflix.system;

import java.util.List;

import com.fakeflix.system.state.CourseState;

public class CourseDecorator implements Course {

    private Course decoratedCourse;

    public CourseDecorator(Course decoratedCourse) {
        this.decoratedCourse = decoratedCourse;
    }

    @Override
    public String getName() {
        return decoratedCourse.getName();
    }

    @Override
    public Level getLevel() {
        return decoratedCourse.getLevel();
    }

    @Override
    public List<String> getSubjects() {
        return decoratedCourse.getSubjects();
    }

    @Override
    public Teacher getTeacher() {
        return decoratedCourse.getTeacher();
    }

    @Override
    public CourseState getState() {
        return decoratedCourse.getState();
    }

    @Override
    public void setState(CourseState state) {
        decoratedCourse.setState(state);
    }

    @Override
    public void setTeacher(Teacher teacher) {
        decoratedCourse.setTeacher(teacher);
    }

    @Override
    public void ready(Teacher teacher) {
        decoratedCourse.ready(teacher);
    }

    @Override
    public void start() {
        decoratedCourse.start();
    }

    @Override
    public void finish() {
        decoratedCourse.finish();
    }

}

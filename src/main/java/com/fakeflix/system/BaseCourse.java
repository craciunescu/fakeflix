package com.fakeflix.system;

import java.util.List;

import com.fakeflix.system.state.CourseState;
import com.fakeflix.system.state.PendingState;
import com.fakeflix.system.state.ReadyState;

public class BaseCourse implements Course {

    private String name;

    private Level level;

    private List<String> subjects;

    private Teacher teacher;

    private CourseState state;

    public BaseCourse(String name, Level level, List<String> subjects, Teacher teacher) {
        this.name = name;
        this.level = level;
        this.subjects = subjects;
        this.teacher = teacher;
        this.state = (teacher != null) ? new ReadyState() : new PendingState();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Level getLevel() {
        return level;
    }

    @Override
    public List<String> getSubjects() {
        return subjects;
    }

    @Override
    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public CourseState getState() {
        return state;
    }

    @Override
    public void setState(CourseState state) {
        this.state = state;
    }

    @Override
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void ready(Teacher teacher) {
        state.ready(this, teacher);
    }

    @Override
    public void start() {
        state.start(this);
    }

    @Override
    public void finish() {
        state.finish(this);
    }

}

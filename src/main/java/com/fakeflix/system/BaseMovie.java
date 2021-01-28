package com.fakeflix.system;

import java.util.List;

import com.fakeflix.system.state.MovieState;
import com.fakeflix.system.state.NotAvailableState;
import com.fakeflix.system.state.AvailableState;

public class BaseMovie implements Movie {

    private String name;

    private Level level;

    private List<String> subjects;

    private Teacher teacher;

    private MovieState state;

    public BaseMovie(String name, Level level, List<String> subjects, Teacher teacher) {
        this.name = name;
        this.level = level;
        this.subjects = subjects;
        this.teacher = teacher;
        this.state = (teacher != null) ? new AvailableState() : new NotAvailableState();
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
    public MovieState getState() {
        return state;
    }

    @Override
    public void setState(MovieState state) {
        this.state = state;
    }

    @Override
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void ready(Teacher teacher) {
        state.available(this);
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

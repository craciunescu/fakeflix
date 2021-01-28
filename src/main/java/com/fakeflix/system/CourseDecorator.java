package com.fakeflix.system;

import java.util.List;

import com.fakeflix.system.state.MovieState;

public class CourseDecorator implements Movie {

    private Movie decoratedCourse;

    public CourseDecorator(Movie decoratedCourse) {
        this.decoratedCourse = decoratedCourse;
    }

    @Override
    public String getName() {
        return decoratedCourse.getName();
    }

    @Override
    public Pegi getPegi() {
        return decoratedCourse.getPegi();
    }

    @Override
    public List<String> getTags() {
        return decoratedCourse.getTags();
    }

    @Override
    public Author getAuthor() {
        return decoratedCourse.getAuthor();
    }

    @Override
    public MovieState getState() {
        return decoratedCourse.getState();
    }

    @Override
    public void setState(MovieState state) {
        decoratedCourse.setState(state);
    }

    @Override
    public void setAuthor(Author author) {
        decoratedCourse.setAuthor(author);
    }

    @Override
    public void ready() {
        decoratedCourse.ready();
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

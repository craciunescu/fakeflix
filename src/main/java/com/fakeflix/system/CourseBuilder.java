package com.fakeflix.system;

import java.util.List;

public class CourseBuilder {
    private String name;
    private Level level;
    private List<String> subjects;
    private Teacher teacher;

    public CourseBuilder name(String name) {
        this.name = name;
        return this;
    }

    public CourseBuilder level(Level level) {
        this.level = level;
        return this;
    }

    public CourseBuilder subjects(List<String> subjects) {
        this.subjects = subjects;
        return this;
    }

    public CourseBuilder teacher(Teacher teacher) {
        this.teacher = teacher;
        return this;
    }

    public Movie build() {
        return new BaseMovie(name, level, subjects, teacher);
    }

}

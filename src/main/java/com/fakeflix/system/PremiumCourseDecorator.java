package com.fakeflix.system;

import java.util.ArrayList;
import java.util.List;

public class PremiumCourseDecorator extends CourseDecorator {

    public PremiumCourseDecorator(Movie decoratedCourse) {
        super(decoratedCourse);
    }

    @Override
    public List<String> getSubjects() {
        List<String> premiumSubjects = new ArrayList<>();
        premiumSubjects.addAll(super.getSubjects());
        premiumSubjects.add("Online Subjects");
        premiumSubjects.add("Premium Subjects");
        return premiumSubjects;
    }

}

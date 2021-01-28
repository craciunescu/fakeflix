package com.fakeflix.system;

import java.util.ArrayList;
import java.util.List;

public class PremiumMovieDecorator extends MovieDecorator {

    public PremiumMovieDecorator(Movie decoratedCourse) {
        super(decoratedCourse);
    }

    @Override
    public List<String> getTags() {
        List<String> premiumtags = new ArrayList<>();
        premiumtags.addAll(super.getTags());
        premiumtags.add("Online tags");
        premiumtags.add("Premium tags");
        return premiumtags;
    }

}

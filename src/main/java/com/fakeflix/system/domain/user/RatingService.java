package com.fakeflix.system.domain.user;

import java.util.List;

public interface RatingService {
    void addRating(Rating rating);
    List<Rating> getRatings();
    int getAverageRating();
}

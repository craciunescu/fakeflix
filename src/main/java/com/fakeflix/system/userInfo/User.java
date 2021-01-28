package com.fakeflix.system.userInfo;

import java.util.List;

import com.fakeflix.system.media.Movie;

import lombok.Data;

@Data
public class User {

    Integer user_id;
    String name;

    List<Movie> watched;
    List<Movie> seen;

}

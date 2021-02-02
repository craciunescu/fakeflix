package com.fakeflix.system.domain;

import java.util.List;

import lombok.Data;

@Data
public class User {

    Integer user_id;
    String name;

    List<Movie> watched;
    List<Movie> seen;

}

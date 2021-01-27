package com.fakeflix.system;

import lombok.Data;

@Data
public class Student {

    String name;
    String surname;
    String id;
    CourseBase[] courses;

}

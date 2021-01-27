package com.fakeflix.system;

public class Teacher {
    private final String name;

    private final String lastName;

    public Teacher(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

}

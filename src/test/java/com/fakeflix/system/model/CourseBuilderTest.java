package com.fakeflix.system.model;

import com.fakeflix.system.Course;
import com.fakeflix.system.CourseBuilder;
import com.fakeflix.system.Level;
import com.fakeflix.system.Teacher;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class CourseBuilderTest {
    @Test
    void shouldInitialize() {
        final Teacher teacher = new Teacher("John", "Doe");

        final Course course = new CourseBuilder().name("Software design fundamentals").level(Level.BEGINNER)
                .subjects(List.of("SOLID_PRINCIPLES", "GOF_PATTERNS")).teacher(teacher).build();

        assertThat(course).isNotNull();
        assertThat(course.getTeacher()).isNotNull();
        assertThat(course.getLevel()).isNotNull();
        assertThat(course.getName()).isNotBlank();
        assertThat(course.getSubjects()).contains("SOLID_PRINCIPLES");
        assertThat(course.getSubjects()).contains("GOF_PATTERNS");
    }

}

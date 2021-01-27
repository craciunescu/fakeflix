package com.fakeflix.system.services;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import com.fakeflix.system.*;
import com.fakeflix.system.state.FinishedState;
import com.fakeflix.system.state.PendingState;
import com.fakeflix.system.state.ReadyState;
import com.fakeflix.system.state.StartedState;

import org.junit.jupiter.api.Test;

public class CourseStateTest {
    @Test
    void shouldNotChangeStateToReady() {
        final List<String> subjects = List.of("SUBJECT1", "SUBJECT2");
        final Course course = new BaseCourse("NAME", Level.BEGINNER, subjects, null);

        course.start();

        assertThat(course.getState()).isInstanceOf(PendingState.class);
    }

    @Test
    void shouldChangeStateToReadyWhenAssignedATeacher() {
        final List<String> subjects = List.of("SUBJECT1", "SUBJECT2");
        final Course course = new BaseCourse("NAME", Level.BEGINNER, subjects, null);

        final Teacher teacher = new Teacher("TEACHER_NAME", "TEACHER_LASTNAME");
        course.ready(teacher);
        assertThat(course.getState()).isInstanceOf(ReadyState.class);
    }

    @Test
    void shouldChangeStateToStartedWhenCourseIsReady() {
        final List<String> subjects = List.of("SUBJECT1", "SUBJECT2");
        final Course course = new BaseCourse("NAME", Level.BEGINNER, subjects, null);

        final Teacher teacher = new Teacher("TEACHER_NAME", "TEACHER_LASTNAME");

        course.ready(teacher);
        course.start();

        assertThat(course.getState()).isInstanceOf(StartedState.class);
    }

    @Test
    void shouldNotChangeStateToFinishedWhenCourseIsNotStarted() {
        final List<String> subjects = List.of("SUBJECT1", "SUBJECT2");
        final Course course = new BaseCourse("NAME", Level.BEGINNER, subjects, null);

        final Teacher teacher = new Teacher("TEACHER_NAME", "TEACHER_LASTNAME");

        course.ready(teacher);
        course.finish();

        assertThat(course.getState()).isInstanceOf(ReadyState.class);
    }

    @Test
    void shouldChangeStateToFinishedWhenCourseIsStarted() {
        final List<String> subjects = List.of("SUBJECT1", "SUBJECT2");
        final Course course = new BaseCourse("NAME", Level.BEGINNER, subjects, null);

        final Teacher teacher = new Teacher("TEACHER_NAME", "TEACHER_LASTNAME");

        course.ready(teacher);
        course.start();
        course.finish();

        assertThat(course.getState()).isInstanceOf(FinishedState.class);
    }

}

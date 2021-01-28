package com.fakeflix.system.services;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import com.fakeflix.system.media.*;
import com.fakeflix.system.media.state.FinishedState;
import com.fakeflix.system.media.state.NotAvailableState;
import com.fakeflix.system.media.state.AvailableState;
import com.fakeflix.system.media.state.StartedState;

import org.junit.jupiter.api.Test;

public class CourseStateTest {
    @Test
    void shouldNotChangeStateToReady() {
        final List<Tag> tags = List.of(Tag.HORROR, Tag.ACTION);
        final Movie course = new BaseMovie("NAME", Pegi.ALLPUBLIC, tags, null);

        course.start();

        assertThat(course.getState()).isInstanceOf(NotAvailableState.class);
    }

    @Test
    void shouldChangeStateToReadyWhenAssignedATeacher() {
        final List<Tag> tags = List.of(Tag.HORROR, Tag.ACTION);
        final Movie course = new BaseMovie("NAME", Pegi.ALLPUBLIC, tags, null);

        course.ready();
        assertThat(course.getState()).isInstanceOf(AvailableState.class);
    }

    @Test
    void shouldChangeStateToStartedWhenCourseIsReady() {
        final List<Tag> tags = List.of(Tag.HORROR, Tag.ACTION);
        final Movie course = new BaseMovie("NAME", Pegi.ALLPUBLIC, tags, null);

        course.start();

        assertThat(course.getState()).isInstanceOf(StartedState.class);
    }

    @Test
    void shouldNotChangeStateToFinishedWhenCourseIsNotStarted() {
        final List<Tag> tags = List.of(Tag.HORROR, Tag.ACTION);
        final Movie course = new BaseMovie("NAME", Pegi.ALLPUBLIC, tags, null);

        course.ready();
        course.finish();

        assertThat(course.getState()).isInstanceOf(AvailableState.class);
    }

    @Test
    void shouldChangeStateToFinishedWhenCourseIsStarted() {
        final List<Tag> tags = List.of(Tag.HORROR, Tag.ACTION);
        final Movie course = new BaseMovie("NAME", Pegi.ALLPUBLIC, tags, null);

        course.ready();
        course.start();
        course.finish();

        assertThat(course.getState()).isInstanceOf(FinishedState.class);
    }

}

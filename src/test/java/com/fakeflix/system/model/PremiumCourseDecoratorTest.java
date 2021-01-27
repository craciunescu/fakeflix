package com.fakeflix.system.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import com.fakeflix.system.*;

import org.junit.jupiter.api.Test;

public class PremiumCourseDecoratorTest {

    public static final String ONLINE_SUBJECTS = "Online Subjects";

    public static final String PREMIUM_SUBJECTS = "Premium Subjects";

    @Test
    void shouldInitialize() {
        final Teacher teacher = new Teacher("John", "Doe");

        final Course baseCourse = new BaseCourse("Software design fundamentals", Level.BEGINNER,
                List.of("SOLID_PRINCIPLES", "GOF_PATTERNS"), teacher);

        final PremiumCourseDecorator premiumCourse = new PremiumCourseDecorator(baseCourse);

        assertThat(premiumCourse).isNotNull();
        assertThat(premiumCourse.getTeacher()).isNotNull();
        assertThat(premiumCourse.getLevel()).isNotNull();
        assertThat(premiumCourse.getName()).isNotBlank();
        assertThat(premiumCourse.getSubjects()).contains(ONLINE_SUBJECTS);
        assertThat(premiumCourse.getSubjects()).contains(PREMIUM_SUBJECTS);

        System.out.println(premiumCourse.getSubjects());
    }

}

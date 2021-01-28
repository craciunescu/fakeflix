package com.fakeflix.system.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

import com.fakeflix.system.*;

public class CourseTest {
    public static final String SOLID_PRINCIPLES = "SOLID principles";

    public static final String GOF_PATTERNS = "GoF patterns";

    @Test
    void shouldInitialize() {
        final Teacher teacher = new Teacher("John", "Doe");

        final Movie baseCourse = new BaseMovie("Software design fundamentals", Level.BEGINNER,
                List.of("SOLID_PRINCIPLES", "GOF_PATTERNS"), teacher);

        assertThat(baseCourse).isNotNull();
        assertThat(baseCourse.getTeacher()).isNotNull();
        assertThat(baseCourse.getLevel()).isNotNull();
        assertThat(baseCourse.getName()).isNotBlank();
        assertThat(baseCourse.getSubjects()).contains("SOLID_PRINCIPLES");
        assertThat(baseCourse.getSubjects()).contains("GOF_PATTERNS");
    }

}

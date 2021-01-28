package com.fakeflix.system.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import com.fakeflix.system.*;

import org.junit.jupiter.api.Test;

public class PremiumCourseDecoratorTest {

    public static final String ONLINE_tags = "Online tags";

    public static final String PREMIUM_tags = "Premium tags";

    @Test
    void shouldInitialize() {
        final Author author = new Author("John", "Doe");

        final Movie baseCourse = new BaseMovie("Software design fundamentals", Pegi.ALLPUBLIC,
                List.of("SOLID_PRINCIPLES", "GOF_PATTERNS"), author);

        final PremiumCourseDecorator premiumCourse = new PremiumCourseDecorator(baseCourse);

        assertThat(premiumCourse).isNotNull();
        assertThat(premiumCourse.getAuthor()).isNotNull();
        assertThat(premiumCourse.getPegi()).isNotNull();
        assertThat(premiumCourse.getName()).isNotBlank();
        assertThat(premiumCourse.getTags()).contains(ONLINE_tags);
        assertThat(premiumCourse.getTags()).contains(PREMIUM_tags);

        System.out.println(premiumCourse.getTags());
    }

}

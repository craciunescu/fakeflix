package com.fakeflix.system.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

import com.fakeflix.system.*;

public class MovieTest {
    public static final String ACTION = "ACTION";

    public static final String HORROR = "HORROR";

    @Test
    void shouldInitialize() {
        final Author author = new Author("John", "Doe");

        final Movie baseCourse = new BaseMovie("The incredibles adventures of a ghost", Pegi.ALLPUBLIC,
                List.of("ACTION", "HORROR"), author);

        assertThat(baseCourse).isNotNull();
        assertThat(baseCourse.getAuthor()).isNotNull();
        assertThat(baseCourse.getPegi()).isNotNull();
        assertThat(baseCourse.getName()).isNotBlank();
        assertThat(baseCourse.getTags()).contains("ACTION");
        assertThat(baseCourse.getTags()).contains("HORROR");
    }

}

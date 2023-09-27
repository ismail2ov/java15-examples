package com.github.ismail2ov;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TextBlocksTest {

    @Test
    void testTextBlocks() {
        String concatenated = "SELECT id, title, text\n"
            + "FROM Article\n"
            + "WHERE category = \"Java\"\n"
            + "ORDER BY title";

        String textBlock = """
            SELECT id, title, text
            FROM Article
            WHERE category = "Java"
            ORDER BY title""";

        assertThat(textBlock).isEqualTo(concatenated);
    }
}

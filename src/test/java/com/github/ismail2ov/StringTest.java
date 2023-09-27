package com.github.ismail2ov;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.ZonedDateTime;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class StringTest {

    @Test
    void testStringFormatted() {
        final Integer userId = 1;
        final String username = "ismail2ov";
        final ZonedDateTime now = ZonedDateTime.now();

        final String message = String.format("User %,d with username %s logged in at %s.", userId, username, now);

        String formattedMessage = "User %,d with username %s logged in at %s.".formatted(userId, username, now);

        assertThat(formattedMessage).isEqualTo(message);
    }

    @Test
    void testStringStripIndent() {
        String html = """
              <html>    s
                <body>      s
                  <h1>Hello!</h1>
                </body>    s
              </html>         s
            """;

        String expected = html.lines()
            .map(line -> "|" + line + "|")
            .collect(Collectors.joining());

        String actual = html.stripIndent()
            .lines()
            .map(line -> "|" + line + "|")
            .collect(Collectors.joining());

        assertThat(actual).isEqualTo(expected);
    }
}

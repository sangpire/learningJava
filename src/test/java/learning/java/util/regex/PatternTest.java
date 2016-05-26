package learning.java.util.regex;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PatternTest {

    public static final String REGEX = "([PD]{1})-(\\d+)";

    @Test
    public void testUseage() {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher("P-4563");
        assertThat(matcher.matches(), is(true));

        assertThat(Pattern.matches(REGEX, "D-456"), is(true));
        assertThat(Pattern.matches(REGEX, "D--456"), is(false));

        assertThat(Pattern.matches(REGEX, "D-45D"), is(false));
    }

    @Test
    public void testMatcher() {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher("P-4563");
        assertThat(matcher.matches(), is(true));
        assertThat(matcher.group(1), is("P"));
        assertThat(matcher.group(2), is("4563"));
    }
}

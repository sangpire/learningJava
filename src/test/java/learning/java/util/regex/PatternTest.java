package learning.java.util.regex;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PatternTest {

    public static final String REGEX_1 = "([PD]{1})-(\\d+)";
    public static final String REGEX_2 = "(\\d+\\.?\\d?)\\/(\\d+\\.?\\d?)";

    @Test
    public void testUseage() {
        Pattern pattern = Pattern.compile(REGEX_1);
        Matcher matcher = pattern.matcher("P-4563");
        assertThat(matcher.matches(), is(true));

        assertThat(Pattern.matches(REGEX_1, "D-456"), is(true));
        assertThat(Pattern.matches(REGEX_1, "D--456"), is(false));

        assertThat(Pattern.matches(REGEX_1, "D-45D"), is(false));
    }

    @Test
    public void testMatcher() {
        Pattern pattern = Pattern.compile(REGEX_1);
        Matcher matcher = pattern.matcher("P-4563");
        assertThat(matcher.matches(), is(true));
        assertThat(matcher.group(1), is("P"));
        assertThat(matcher.group(2), is("4563"));
    }

    @Test
    public void testMatcherForRegex2_1() {
        Pattern pattern = Pattern.compile(REGEX_2);
        Matcher matcher = pattern.matcher("3.4/4.5");
        assertThat(matcher.matches(), is(true));
        assertThat(matcher.group(1), is("3.4"));
        assertThat(matcher.group(2), is("4.5"));
    }

    @Test
    public void testMatcherForRegex2_2() {
        Pattern pattern = Pattern.compile(REGEX_2);
        Matcher matcher = pattern.matcher("3/4.5");
        assertThat(matcher.matches(), is(true));
        assertThat(matcher.group(1), is("3"));
        assertThat(matcher.group(2), is("4.5"));
    }

    @Test
    public void testMatcherForRegex2_3() {
        Pattern pattern = Pattern.compile(REGEX_2);
        Matcher matcher = pattern.matcher("3/5");
        assertThat(matcher.matches(), is(true));
        assertThat(matcher.group(1), is("3"));
        assertThat(matcher.group(2), is("5"));
    }

    @Test
    public void testMatcherForRegex2_4() {
        Pattern pattern = Pattern.compile(REGEX_2);
        Matcher matcher = pattern.matcher("3.4.5/5");
        assertThat(matcher.matches(), is(false));
    }
}

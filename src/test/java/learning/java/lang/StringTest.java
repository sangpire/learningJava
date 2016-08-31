package learning.java.lang;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StringTest {

    @Test
    public void testStartsWidth() {
        assertThat("ABCDEF".startsWith("AB"), is(true));
        assertThat("ABCDEF".startsWith("CD", 2), is(true));
    }

    @Test
    public void testSubstring() {
        assertThat("ABCDEF".substring(4), is("EF"));
    }

    @Test
    public void testSplit() {
        assertThat("AB-CD".split("-"), is(new String[] {"AB", "CD"}));
    }

    @Test
    public void testReplaceAll() {
        assertThat("AB12CD".replaceAll("\\d", "."), is("AB..CD"));
        assertThat("AB\nCD".replaceAll("\\n", "<br/>"), is("AB<br/>CD"));
    }

}

package learning.java.lang;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by sangpire on 2016. 5. 25..
 */
public class StringTest {

    @Test
    public void testStartsWidth() {
        assertThat("ABCDEF".startsWith("AB"), is(true));
        assertThat("ABCDEF".startsWith("CD", 2), is(true));
    }

}

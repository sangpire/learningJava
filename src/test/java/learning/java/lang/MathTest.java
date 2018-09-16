package learning.java.lang;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class MathTest {

    @Test
    public void testCeil() {
        assertThat((5/2), is(2));
        assertThat((5/2), is(instanceOf(Integer.class)));
        assertThat(((double) 5/2), is(2.5));
        assertThat(((double) 5/2), is(instanceOf(Double.class)));

        assertThat((int) Math.ceil((double) 5/2), is(3));
    }

    @Test
    public void testFloor() {
        assertThat((int) Math.floor((double) 5/2), is(2));
    }
}

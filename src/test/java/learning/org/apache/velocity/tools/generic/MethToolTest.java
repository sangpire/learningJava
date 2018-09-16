package learning.org.apache.velocity.tools.generic;

import org.apache.velocity.tools.generic.MathTool;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class MethToolTest {

    private MathTool methTool = new MathTool();

    @Test
    public void testDiv() {
        assertThat(methTool.div(10, 5), is(2));
        assertThat(methTool.div(3, 2), is(1.5));
    }

}

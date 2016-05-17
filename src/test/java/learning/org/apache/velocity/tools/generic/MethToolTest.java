package learning.org.apache.velocity.tools.generic;

import org.apache.velocity.tools.generic.MathTool;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MethToolTest {

    private MathTool methTool = new MathTool();

    @Test
    public void testDiv() {
        assertThat(methTool.div(10, 5), Is.<Number>is(2));
        assertThat(methTool.div(3, 2), Is.<Number>is(1.5));
    }

}

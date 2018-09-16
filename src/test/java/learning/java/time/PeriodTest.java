package learning.java.time;

import java.time.Period;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by sangpire on 2016. 10. 18..
 */
public class PeriodTest {

    @Test
    public void name() throws Exception {
        Period p = Period.ofDays(360);
        p = p.normalized();
        assertThat(0, is(p.toTotalMonths()));
    }
}

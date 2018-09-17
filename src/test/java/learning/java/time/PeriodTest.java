package learning.java.time;

import org.junit.jupiter.api.Test;

import java.time.Period;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by sangpire on 2016. 10. 18..
 */
public class PeriodTest {

    @Test
    public void name() throws Exception {
        Period p = Period.ofDays(360);
        p = p.normalized();
        assertThat(0L, is(p.toTotalMonths()));
    }
}

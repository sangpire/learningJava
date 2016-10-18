package learning.java.time;

import org.junit.Test;

import java.time.Period;

import static java.time.Period.ofDays;
import static org.junit.Assert.assertEquals;

/**
 * Created by sangpire on 2016. 10. 18..
 */
public class PeriodTest {

    @Test
    public void name() throws Exception {
        Period p = Period.ofDays(360);
        p = p.normalized();
        assertEquals(0, p.toTotalMonths());
    }
}

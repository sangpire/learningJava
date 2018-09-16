package learning.java.time.temporal;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by sangpire on 2016. 10. 18..
 * Chrono := '때'
 */
public class ChronoUnitTest {

    @Test
    public void betweenTest() throws Exception {

        LocalDate birthDay = LocalDate.parse("1980-05-27");
        LocalDate today = LocalDate.parse("2016-10-18");

        assertThat(13293, is(ChronoUnit.DAYS.between(birthDay, today)));
        assertThat(436, is(ChronoUnit.MONTHS.between(birthDay, today)));
        assertThat(36, is(ChronoUnit.YEARS.between(birthDay, today)));
    }
}

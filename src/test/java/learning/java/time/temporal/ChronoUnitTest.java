package learning.java.time.temporal;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static org.hamcrest.CoreMatchers.is;
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

        assertThat(13293L, is(ChronoUnit.DAYS.between(birthDay, today)));
        assertThat(436L, is(ChronoUnit.MONTHS.between(birthDay, today)));
        assertThat(36L, is(ChronoUnit.YEARS.between(birthDay, today)));
    }
}

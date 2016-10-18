package learning.java.time.temporal;

import org.junit.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static org.junit.Assert.assertEquals;

/**
 * Created by sangpire on 2016. 10. 18..
 * Chrono := '때'
 */
public class ChronoUnitTest {

    @Test
    public void betweenTest() throws Exception {

        LocalDate birthDay = LocalDate.parse("1980-05-27");
        LocalDate today = LocalDate.parse("2016-10-18");

        assertEquals(13293, ChronoUnit.DAYS.between(birthDay, today));
        assertEquals(436, ChronoUnit.MONTHS.between(birthDay, today));
        assertEquals(36, ChronoUnit.YEARS.between(birthDay, today));
    }
}

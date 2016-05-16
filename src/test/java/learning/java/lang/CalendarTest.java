package learning.java.lang;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.assertThat;

public class CalendarTest {

    @Test
    public void testGetTimeInMillis() {
        // 대략 같다는 의미로 10 이하 숫자까지 비교하지 않음.
        assertThat(Calendar.getInstance().getTimeInMillis() / 10L, is(System.currentTimeMillis() / 10L));
    }

}

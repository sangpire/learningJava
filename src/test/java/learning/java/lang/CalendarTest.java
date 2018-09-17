package learning.java.lang;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

/**
 * `java.util.Calendar` 에 관한 테스트.
 */
@DisplayName("A special test case")
public class CalendarTest {

    @Test
    @DisplayName("뭘 테스트 하려고 한 것일까?")
    public void testGetTimeInMillis() {
        // 대략 같다는 의미로 10 이하 숫자까지 비교하지 않음.
        long msFromCalendar = Calendar.getInstance().getTimeInMillis();
        long msFromSystem = System.currentTimeMillis();
        long msDiff = msFromSystem - msFromCalendar;

        System.out.println(msDiff);
        Assertions.assertTrue(msDiff < 100L, "100ms 이상 차이가 나지 않는다.");

    }

}

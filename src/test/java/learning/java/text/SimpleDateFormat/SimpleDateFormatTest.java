package learning.java.text.SimpleDateFormat;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by sangpire on 2016. 5. 13..
 */
public class SimpleDateFormatTest {

    Date DATE_1980_04_14 = new Date(1980 - 1900, 3, 14);
    Date DATE_2016_01_01 = new Date(2016 - 1900, 0, 1);


    @Test
    public void testForamt() {
        assertEquals("1980년 04월 14일", (new SimpleDateFormat("yyyy년 MM월 dd일")).format(DATE_1980_04_14));
        assertEquals("2016년 01월 01일", (new SimpleDateFormat("yyyy년 MM월 dd일")).format(DATE_2016_01_01));
        assertEquals("1980년 4월 14일", (new SimpleDateFormat("yyyy년 M월 d일")).format(DATE_1980_04_14));
        assertEquals("2016년 1월 1일", (new SimpleDateFormat("yyyy년 M월 d일")).format(DATE_2016_01_01));
    }

}

package learning.java.text.SimpleDateFormat;

import org.junit.Test;

import java.sql.Date;
import java.text.SimpleDateFormat;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

/**
 * Created by sangpire on 2016. 5. 13..
 */
public class SimpleDateFormatTest {

    Date DATE_1980_04_14 = new Date(1980 - 1900, 3, 14);
    Date DATE_2016_01_01 = new Date(2016 - 1900, 0, 1);


    @Test
    public void testForamt() {
        assertThat((new SimpleDateFormat("yyyy년 MM월 dd일")).format(DATE_1980_04_14), equalTo("1980년 04월 14일"));
        assertThat((new SimpleDateFormat("yyyy년 MM월 dd일")).format(DATE_2016_01_01), equalTo("2016년 01월 01일"));

        assertThat((new SimpleDateFormat("yyyy년 M월 d일")).format(DATE_1980_04_14), equalTo("1980년 4월 14일"));
        assertThat((new SimpleDateFormat("yyyy년 M월 d일")).format(DATE_2016_01_01), equalTo("2016년 1월 1일"));
    }

}

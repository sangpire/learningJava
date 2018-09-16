package learning.org.apache.commons.beanutils;

import org.apache.commons.beanutils.BeanMap;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BeanMapTest {

    public class Person {
        int age;
        String name;

        public Person(String name, int age) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    @Test
    public void testBeansMap() {
        Person sangpil = new Person("BYUN Sangpil", 18);
        BeanMap sangpilBeanMap = new BeanMap(sangpil);

        assertTrue(sangpilBeanMap instanceof Map);

        Map<String, Object> expectedInMap = new HashMap<>();
        expectedInMap.put("age", 18);
        expectedInMap.put("name", "BYUN Sangpil");

        assertEquals(18, sangpilBeanMap.get("age"));
        assertEquals("BYUN Sangpil", sangpilBeanMap.get("name"));
    }

}

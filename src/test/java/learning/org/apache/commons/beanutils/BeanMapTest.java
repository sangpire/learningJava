package learning.org.apache.commons.beanutils;

import org.apache.commons.beanutils.BeanMap;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

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

        assertThat(sangpilBeanMap, is(instanceOf(Map.class)));

        Map<String, Object> expectedInMap = new HashMap<>();
        expectedInMap.put("age", 18);
        expectedInMap.put("name", "BYUN Sangpil");

        assertThat(sangpilBeanMap, hasEntry("age", 18));
        assertThat(sangpilBeanMap, hasEntry("name", "BYUN Sangpil"));
    }

}

package Lab05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

public class JoinStringsTest {

    @Test
    public void testJoinStrings() {

        String result = JoinStrings.joinStrings(
                Arrays.asList("Java", "JUnit", "NetBeans"),
                ", "
        );

        assertEquals(
                "Java, JUnit, NetBeans",
                result
        );
    }

    @Test
    public void testSingleElement() {

        String result = JoinStrings.joinStrings(
                Collections.singletonList("Java"),
                ", "
        );

        assertEquals("Java", result);
    }
}
package Lab05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SearchStrategiesTest {

    @Test
    public void testDifferentResultsWithDuplicates() {

        int[] arr = {10, 20, 30, 20, 40};

        assertEquals(1, SearchStrategies.findFirst(arr, 20));
        assertEquals(3, SearchStrategies.findLast(arr, 20));
    }

    @Test
    public void testSameResultWhenElementAppearsOnce() {

        int[] arr = {10, 20, 30, 40};

        assertEquals(2, SearchStrategies.findFirst(arr, 30));
        assertEquals(2, SearchStrategies.findLast(arr, 30));
    }

    @Test
    public void testMissingValue() {

        int[] arr = {10, 20, 30};

        assertEquals(3, SearchStrategies.findFirst(arr, 50));
        assertEquals(-1, SearchStrategies.findLast(arr, 50));
    }
}
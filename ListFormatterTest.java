package Lab05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListFormatterTest {

    @Test
    public void testSortInPlace() {

        List<String> words =
                new java.util.ArrayList<>(
                        Arrays.asList("Orange", "Apple", "Banana")
                );

        ListFormatter.sortInPlace(words);

        assertEquals(
                Arrays.asList("Apple", "Banana", "Orange"),
                words
        );
    }

    @Test
    public void testToLowerCaseDoesNotModifyOriginalList() {

        List<String> original =
                Arrays.asList("Apple", "BANANA", "Orange");

        List<String> result =
                ListFormatter.toLowerCase(original);

        assertEquals(
                Arrays.asList("Apple", "BANANA", "Orange"),
                original
        );

        assertEquals(
                Arrays.asList("apple", "banana", "orange"),
                result
        );
    }
}
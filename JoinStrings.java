package Lab05;

import java.util.List;

public class JoinStrings {

    /**
     * BAD OPERATIONAL JAVADOC:
     *
     * First, create an empty StringBuilder. Then use a for loop
     * to visit every element in the list. Append the current
     * element to the StringBuilder. Use an if-statement to check
     * whether the current element is the last element. If it is
     * not the last element, append the delimiter. Continue the
     * loop until all elements have been processed. Finally,
     * convert the StringBuilder into a String and return it.
     *
     * GOOD DECLARATIVE JAVADOC:
     *
     * Returns the concatenation of elements in order, with the
     * delimiter inserted between each adjacent pair.
     *
     * @param words list of strings to join
     * @param delimiter separator inserted between adjacent elements
     * @return concatenated string
     */
    public static String joinStrings(
            List<String> words,
            String delimiter) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.size(); i++) {

            result.append(words.get(i));

            if (i < words.size() - 1) {
                result.append(delimiter);
            }
        }

        return result.toString();
    }
}
package Lab05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFormatter {

    public static void sortInPlace(List<String> lst) {

        Collections.sort(lst);
    }

    public static List<String> toLowerCase(List<String> lst) {

        List<String> result = new ArrayList<>();

        for (String word : lst) {
            result.add(word.toLowerCase());
        }

        return result;
    }
}
package Lab05;

public class SearchStrategies {

    public static int findFirst(int[] arr, int val) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == val) {
                return i;
            }
        }

        return arr.length;
    }

    public static int findLast(int[] arr, int val) {

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] == val) {
                return i;
            }
        }

        return -1;
    }
}
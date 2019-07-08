import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{-9, -2, 0, 2, 3};

        for (int i : arraySquarer(array)) {
            System.out.print(i + " ");
        }
    }

    /**
     * Good morning! Here's your coding interview problem for today.
     *
     * This problem was asked by Google.
     *
     * Given a sorted list of integers, square the elements and give
     * the output in sorted order.
     *
     * For example, given [-9, -2, 0, 2, 3], return [0, 4, 4, 9, 81].
     * @param array integer array to square
     * @return result
     */
    private static int[] arraySquarer(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }
        Arrays.sort(array);
        return array;
    }
}
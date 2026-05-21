package array;
import java.util.Arrays;

public class reverseArray {

    // 0(n) => Big Notation
    public static void main(String[] args) {
        int[] number = { 10, 15, 12, 17, 18, 20, 19 };

        reverseArrayvalue(number);
        System.out.println("Your Array Element: " + Arrays.toString(number));
    }

    public static void reverseArrayvalue(int[] arr) {
        int start = 0; // [0] = 10
        int end = arr.length - 1; // [6] = 19

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    }
}
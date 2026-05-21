package array;
import java.util.Arrays;

public class evenoddconuter {

    public static void main(String[] args) {
        int[] number = { 2, 4, 6, 8, 3, 92, 4, 75, 93 };

        evenoddconuter(number);

        System.out.println("no of Element: " + Arrays.toString(number));
    }

    public static void evenoddconuter(int[] arr) {
        int evenconuter = 0;
        int oddconunter = 0;

        for (int numbers : arr) {
            if (numbers % 2 == 0) {
                evenconuter++;
            } else {
                oddconunter++;
            }
        }

        System.out.print("Even Element: " + evenconuter +"\n");
        System.out.println("Odd Element: " + oddconunter);
    }

}

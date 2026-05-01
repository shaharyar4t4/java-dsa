import java.util.Arrays;

public class insectionarray {

    public static void main(String[] args) {

        // question: A value is insect in starting.....

        int[] arr = { 10, 20, 30 };

        // declare new value
        int value = 5;

        int[] newArr = new int[arr.length + 1]; // initialize new array and exist arr increase the arr size
        newArr[0] = value;

        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];

            // at start [0] 5
            // first [1] 10
            // second [2] 20
            // third [3] 30
        }
        // System.out.println(newArr); // this command show the address of array
        System.out.println("the new Array value" + Arrays.toString(newArr));

    }
}
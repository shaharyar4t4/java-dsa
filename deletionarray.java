import java.util.Arrays;

public class deletionarray {

    public static void main(String[] args) {

        int[] number = { 10, 20, 30, 40, 50 };

        System.out.println("The Element of Array: "+ Arrays.toString(number));

        // Delete for Start...
        // int[] numbers = deletefromarray(number, 0);
        // System.out.println("After delete the Element: "+ Arrays.toString(numbers));

        // Delete for Ending..
        // int[] numbers = deletefromarray(number, number.length-1);
        // System.out.println("After delete the Element: "+ Arrays.toString(numbers));

        // Delete for anywhere...
        int[] numbers = deletefromarray(number, 3);
        System.out.println("After delete the Element:" + Arrays.toString(numbers));
    }

    // make separate static class "Static class mean's they don't need to object"
    public static int[] deletefromarray(int[] arr, int index) {
        // if index value must be big on "0" or not bigger then arr.length value
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid Index");
            return arr;
        }
        // declare new array..
        int[] newArr = new int[arr.length - 1];

        // "i" is used for run the loop
        // "j" is used for as a counter of newArr.
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index)
                continue; // continue is "skip" the value which in index value.. [0] = 10 (delete)
            newArr[j++] = arr[i];
        }
        return newArr;

    }
}

import java.util.Arrays;

public class insectionarray {

    public static void main(String[] args) {

        // question: A value is insect in starting.....

        //big notiation = o(n) just because of Loop

        int[] arr = { 10, 20, 30 };

        // // declare new value
        int value = 5;

        // int[] newArr = new int[arr.length + 1]; // initialize new array and exist arr increase the arr size
        // newArr[0] = value;

        // for (int i = 0; i < arr.length; i++) {
        //     // newArr[i +1] ka mtlab ye new value ab one se aayi gi
        //     newArr[i + 1] = arr[i];

        //     // at start [0] 5
        //     // first [1] 10
        //     // second [2] 20
        //     // third [3] 30
        // }
        // // System.out.println(newArr); // this command show the address of array
        // System.out.println("the new Array value" + Arrays.toString(newArr));

        // question: A value is insect in Ending.....

        // int[] newArr = new int[arr.length +1]; // this line show's increase the size of array
        // for(int i =0; i < arr.length; i++){
        //     newArr[i] = arr[i];

        //     // first [0] == 10
        //     //second [1] == 20
        //     // third [3] == 30
        // }
        // newArr[arr.length] = value;  // last == 5

        // System.err.println(Arrays.toString(newArr));

        // question: A value is insect in anywhere.....

        int index = 1;
        int[] newArr = new int[arr.length +1];

        //index mean --> value index ta jaya gi phir break
        for(int i=0; i< index; i++){ // 10 [0], break [index]
            newArr[i] = arr[i];
        }

        newArr[index] = value;  // index [2] = 5

        for(int i = index; i< arr.length; i++){ // contiune 20[2], 30 [3]
            newArr[i+1] = arr[i];   
        }

        System.out.println("the new ELement is " + Arrays.toString(newArr));


    }
}
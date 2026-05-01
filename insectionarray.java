import java.util.Arrays;

public class insectionarray {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        int value = 80;

        // Question: Insect the value at Starting...
        //big notation = 0(n)

        // int[] newArr = new int[arr.length + 1];
        // newArr[0] = value; // [0] 80

        // for (int i = 0; i < arr.length; i++) {
        //     newArr[i + 1] = arr[i]; // [1] 10, [2] 20, [3] 30, [4] 40
        // }

        // System.out.println("the Element:" + Arrays.toString(newArr));

        // Question: Insect the value at Ending......
        // int[] newArr = new int[arr.length +1]; // this just increase the size of array

        // for(int i = 0; i< arr.length; i++){
        //     newArr[i] = arr[i];
        // }
        //  newArr[arr.length]=  value;
        //  System.out.println("the Element value"+ Arrays.toString(newArr));


        // Insecting the value in mid of Array
        int[] newArr = new int[arr.length +1];
        int index =2;

        for(int i = 0; i< index; i++){
            newArr[i] = arr[i];
        }

        newArr[index]= value;

        for(int i= index; i<arr.length; i++ ){
            newArr[i+1] = arr[i];
        }
         
        System.out.println("the Element: "+ Arrays.toString(newArr));

        
    }

}
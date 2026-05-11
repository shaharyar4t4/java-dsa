public class maxvalue {
    // Big Notation => 0(n)
    
    public static void main(String[] args) {
        int[] number = { 15, 20, 18, 19, 31, 14 };
        // int maxValue = findMaxValue(number);
        int minValue = findMinValue(number);
        System.out.println("Max Element value: " + minValue);
    }

    // Max Value Finding 
    // public static int findMaxValue(int[] arr) {
    //     if (arr.length == 0) {
    //         System.out.println("Element Should be Empty");

    //     }

    //     int max = arr[0]; // they are select the initial value [0] = 15
    //     for (int i = 1; i < arr.length; i++) {
    //         if (arr[i] > max) {

    //             // 15 > 20;     max value  = 20 (updated)
    //             // 20 > 18;
    //             // 20 > 19;
    //             // 20 > 31;     max value  = 31 (updated)
    //             // 31 > 14 
    //             max = arr[i];   
    //         }
    //     }
    //     return max;  // max value return  31
    // }

    // Min Value finding
        public static int findMinValue(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Element Should be Empty");

        }

        int min = arr[0]; // they are select the initial value [0] = 15
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {

                // 15 > 20;     max value  = 20 (updated)
                // 20 > 18;
                // 20 > 19;
                // 20 > 31;     max value  = 31 (updated)
                // 31 > 14 
                min = arr[i];   
            }
        }
        return min;  // max value return  31
    }

}
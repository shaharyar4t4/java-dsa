public class binarysearch {

    public static void main(String[] args) {
     
        // they are only working sorted array...
        int[] sortadArray = {10, 20, 30, 40, 50, 60};
        int target = 40;

        int result = binarySearchArray(sortadArray, target);
        System.out.println("the Target Element: "+ result);

    }


    public static int binarySearchArray(int[] arr, int target){

        int start = 0; // start arr... 0  {10, 20, 30, 40, 50, 60} ===> {0,1,2,3,4,5}
        int end = arr.length -1;  // end index value

        while (start <= end) {

            // int mid = (start - end)/ 2; this fomula create the overflow ... overflow mean's the array have min size..

            // this foumale is use for finding the value in real world case... b/s they help to remove the overflow
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            //  the target value is big then left side inshort they work on small value...
            else if(target < arr[mid]){
                end = mid -1;
            }

            else{
                start = mid+1;
            }

        }
        return -1;
    }
}
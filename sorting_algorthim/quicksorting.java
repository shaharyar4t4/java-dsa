public class quicksorting{

//   Time complex => o(n log n) ==> best , avge case..
//   if you select worng pivot so is time comple 0(n^2) on worst case..
    // quick sort function
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            // this function is prefrom the pivot process
            int pivotIndex = partition(arr, low, high);

            //left sub array ki value yehe collected hogi.. (ye par jitni small value hogi pivot se wo left side me jaya gi)
            quickSort(arr, low, pivotIndex - 1);
            // right sub array ki value yehe collected hogi..(ye par jitni big value hogi pivot se wo right side me jaya gi)
            quickSort(arr, pivotIndex + 1, high);


        }


    }
    // partition function..
    private static int partition(int[] arr, int low , int high){
        int pivot = arr[high];
        int i = low - 1; // by defualt value yehe par -1 aayi gi 
        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr [i];
                arr [i] = arr[j];
                arr[j] = temp;
            }
        }
        //[5, 3, 4, 2, 10] // let suppose ye pivot ki value 4 thi tu is ko correct place par move karna hoga..
        int temp = arr[i + 1];
        arr[i + 1 ]= arr[high];
        arr[high] = temp; // --> after the process array becomes sorted [2, 3, 4, 5, 10]
        return  i + 1; // ==> ye pivot value ko return karta ha .
    }

 public static void showArray(int [] arr){
    for(int value : arr ){
        System.out.print(value + " ");
    }
    System.out.println();
 }

    public static void main(String [] args){
        int[] studentHeights = { 170, 150, 180, 160, 190 };
        System.out.println("Before Sorting: ");
        showArray(studentHeights);

        System.out.println("After Sorting: ");
        quickSort(studentHeights, 0, studentHeights.length - 1 );
        showArray(studentHeights);
    }
}
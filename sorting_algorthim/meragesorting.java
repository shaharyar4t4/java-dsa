public class meragesorting{
 // is ka drop back ye ha kiya space complexcity = o(n) 
 // ye multiple array bohat bnta ha jese waja se hum use nhi karta ha like q humraha pass size limit hoti ha array ki..

// in meage sorting the process is working like kiya ap kiya array ko completely break karta jab ta wo single value me na aajya..
// is na jese break kiya tha wese he single value ko phr meage phir is ko meage kardo jab wo sort hogya ha.

// in papar work first array me se ik mid point nikala ga phir array sort karya ga (v1 + V2)/2

public static void meragesorting(int[] arr, int left, int right){

    //"left" is represent the starting index values...
    // "right" is represent the ending index values.. means remaining values...
    if(left < right){
        // important interview question:
        // ye small value par sehi kam karta ha but big values par kam nhi karta ha..
        // problem hota ha ye array ki limited size hoti ha... jese ki waja se mid point formula se avoid karta ha.. like overflow hojaya 
        // int mid = ( left + right)/2; bad partices
        int mid = left + (right - left)/2;
        
        // left half part
        meragesorting( arr, left, mid);

        //right half part
        meragesorting(arr, mid + 1, right);

        merage(arr, left, mid, right);

    }
}
    private static void merage(int [] arr, int left, int mid, int right){
        // divide the array mid and left

        int n1 =  mid - left + 1; // left side me only sort value aayi gi
        int n2 =  right - mid; // right side me unsorted store  hogi..

        int [] lft = new int[n1];
        int [] rig = new int[n2];

        for(int i = 0; i < n1; i++){
            lft[i] = arr[left + i];
        }

        for(int j =0; j < n2; j++){
            rig[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0 , k = left;

        //k --> is represent the actural sorted array.. after complete the whole process.

        // the loop is help to compare the left and right array..
        // it break the array is two or more parts..
        while(i < n1 && j < n2){
            if(lft[i] <= rig[j]){
                arr[k] = lft[i];
                i++;

            }else{
                arr[k] = rig[j];
                j++;

            }
            k++; 
        }

        // copy the remaining elements into left array value.. (after divide value..)
        while(i < n1){
            arr[k] = lft[i];
            i++;
            k++;
        }
        // copy the remaining elements into right array value.. (after divide value...)
        while(j < n2){
            arr[k] = rig[j];
            j++;
            k++;
        }
    }

    // print all the sorted value.
    public static void showArray(int[] arr){
        for(int value:  arr){
            System.out.print(value + " ");
        }
        System.out.println();
    }


 public static void main(String [] args){
    int[] marks = {20, 40, 10, 70, 60 , 30};
    System.out.print("Before the Sorting: ");
    showArray(marks);

    System.out.print("After the Sorting: ");
    meragesorting(marks, 0, marks.length - 1);
    showArray(marks);
 }   
}
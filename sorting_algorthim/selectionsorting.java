package sorting_algorthim;

public class selectionsorting{

    // time compex ==> o(n^2) in all case beasuse ik itentation me ik swapping hoti ha..
    // selection sort me hum ye karta ha kiya 
    // complete array ko read karta... me se value find karta ha phir jo sub se smallest value hoti ha wo front par aati ha 
    public static void selection(int [] marks){
        int n = marks.length;
        // why n-1 means koi hum last wali value ko check nhi karya ga wo humsha se
        // sorting formate me hogi..
        // outer loop ka kam hota ha wo humsha last value ko located karta ha..
        // inner loop ==> array ki value ko sort karti ha..
        for(int i=0; i< n-1; i++){
            // inner loop ==> array ki value ko sort karti ha..
            int minIndex = i;
            for(int j = i + 1; j<n; j++){
                // is condition me ye horaha ha kiya let suppose humraha pass 
                // 170 ik value or ye array me ha or yehe first index.. tu is ko liya karta complete array ko check karya ga like is value (170) ko small hogi tu is ko 170 se replaces kardaya ga..
                if(marks[j] < marks[minIndex]){
                    minIndex = j;
                }
            }
            int temp =  marks[minIndex];
            marks[minIndex] = marks[i];
            marks[i] = temp;
        }


    }

    public static void showArray(int [] arr){
        for (int value : arr){
            System.out.print(value + " ");
        }
        System.out.println();
    }
    

    public static void main(String [] args){
        int[] marksvalue = {150, 130, 120, 185, 174, 200};
        System.out.print("\n Before the Sorting: ");
        showArray(marksvalue);

        System.out.print("\n After the Sorting: ");
        // implementation process of selection sorting...
        selection(marksvalue);
        showArray(marksvalue);
    }
}
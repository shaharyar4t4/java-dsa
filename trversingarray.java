
public class trversingarray {

    public static void main(String[] args) {

        // Trevsing in Array

        // fetch the one Array
        int[] number = { 10, 20, 30, 40, 50 };

        // System.out.println("the Element at [3]: " + number[3]);

        // visit the every element
        // for (int i = 0; i < number.length; i++) {
        //     System.out.println("The Element at " +"["+i+"]"+ ": " + number[i]);
        // }

        // visit the every element in reverse..
    //     for(int i = number.length -1 ; i > 0; i--) // number.length -1 (means jo last index se kiya bt se reverse order me jaya)
    //     {
    //         System.out.println("The Element at " +"["+i+"]"+ ": " + number[i]);
    //     }
        
        // Treversing by using the For Each Loop

        // num is store the index value like [0] =10
        for(int num : number){
            System.out.println("the Element:"+ num );
        }




    }
}
public class arraybasic {

    public static void main(String[] args) {
        // int[] myNumbers; // Declare
        // myNumbers = new int[5]; // Initialize

        int[] myNumber = new int[5]; // Declaration + Size Initialization

        int[] mynumbertwo = { 1, 2, 3, 4, 5, 6 }; 

        System.out.println("\n Element the [2]: " + mynumbertwo[2]);

        // Insert
        myNumber[0] = 10;
        myNumber[1] = 20;
        myNumber[2] = 30;
        myNumber[3] = 40;
        myNumber[4] = 50;

        System.out.println("\n Element the [2]: " + myNumber[2]);

    }
}
import java.util.Scanner;

public class backtrackingpermutation{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String to see it permutation: ");
        String str = input.next();

        System.out.println("\n All permutations of " + str + ": ");

        // this method prefrom the permutation process.. 
       // A permutation is the way a set of items is arranged or ordered where the order of the items matters
        // at the time of starting string value is empty ""
        findPermutations(str, "");
        input.close();
    }

    public static void findPermutations(String str, String currentPermutations){
        if(str.isEmpty()){
            System.out.println ("->" + currentPermutations);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char currentChar = str.charAt(i);
            // this line have main logic like jo currentChar ki value is ko replace kardaya remainingString se..
            String remainingString = str.substring(0, i) + str.substring(i + 1);
            // ABC (currentChar) = is me hum na "B" ko remove kardaya ha phir ye value bachaya gi like AC
            findPermutations(remainingString, currentPermutations + currentChar);
            // ABC ==> is me A ko side kardaya phir
            // remain BC or "A" jo currentPermutations hoga..
            // A kiya possible partten ye banya ga like "BC" (fixed),"ABC", "ACB", "BCA", "BAC", "CAB", "CBA"
        }
    }
}



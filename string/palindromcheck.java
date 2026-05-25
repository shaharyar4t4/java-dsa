package string;

public class palindromcheck {
    public static void main(String[] args) {
        String word = "madam";

        System.out.println("the except word: "+ palindromchecker(word));
    }

    public static boolean palindromchecker(String str){
        int start = 0;// select start value means "move forward"
        int end = str.length() - 1; // select end value means "move backward"

        while (start < end) {

            // charAt is pass the specific the index value...
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }

            start ++;
            end -- ; 
        }

        return true;
    }
}


// IMPORTAMT "palindrome means: the word reads the same from left → right and right → left"


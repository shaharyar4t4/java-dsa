package string;

public class reversecompleteword {

    public static void main(String[] args) {
        String input = "My name is Shaharyar";
        System.out.println("The Reverse Complete word: " + reversecompletetring(input));
    }

    public static String reversecompletetring(String str) {

        // trim() ---> Remove the Start space and end Space of any Sentences..
        // Split() ---> Add the Space when sentence is reverse in order "\\s+" by using
        // this Regex..
        String[] word = str.trim().split("\\s+");

        // StringBuilder help to modified the whole string using existence
        StringBuilder revered = new StringBuilder();

        for (int i = word.length - 1; i >= 0; i--) {
            // "Shaharyar" [0],
            // "is" [1],
            // "name" [2],
            // "My" [3]
            revered.append(word[i]);

            // we need b/w the word
            if (i!= 0)
                revered.append(" ");
        }

        return revered.toString();

    }
}

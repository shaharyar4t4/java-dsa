
public class vowelcount {
    public static void main(String[] args) {
        String word = "Education";
        System.out.println("the vowels count :" + vowelvolumn(word));
    }

    public static int vowelvolumn(String str) {
        int count = 0;
        str = str.toLowerCase(); // convert all captain word into small words....

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // take there index values...
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++; // increase the value of index value...

            }
        }

        return count;

    }

}

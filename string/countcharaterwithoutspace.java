
public class countcharaterwithoutspace {
    public static void main(String[] args) {
        String sen = "My name is Shaharyar";

        System.out.println("the sentence become the without space " + withoutSpace(sen));
    }

    public static int withoutSpace(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++; // the increase the of index mean's value fetching one by one..
            }
        }
        return count;
    }
}

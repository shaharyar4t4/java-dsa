package string;

public class frequencycheck {
    public static void main(String[] args) {
        String word = "banana";
        char target = 'a';
        System.out.println("the frequency of ' "+ target +" ' is " + countValue(word, target));
    }
    
    public static int countValue(String str, int target){

        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == target){
                count++; // incrase the value of target (a)
            }
        }
        return count;
    }
}

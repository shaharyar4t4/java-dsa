package bitmanipulation;

// this problem solve by not used the % opeator
public class bitexample {
    public static void main(String[] args) {
        int n = 7;
        if ((n & 1) == 1) {
            System.out.println("number is odd");
        } else {
            System.out.println("the value is even");
        }
    }
}

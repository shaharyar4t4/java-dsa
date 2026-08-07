package dynamic_programing;

// fibonacci series..
// 0 1 ab jo next value aayi gi wo previous 2 number ka sum hoga 0+1 => 1 , 1 ==> 1+1 = 2 and so on..

public class dynamicProgramming {

    // this implemention is possible by using the recurions..

    // so that why the Time complex 2 ^n which is not good.. solution is dynamic
    // programing so it the TC will become the n(1)
    // programing..
    public static int fibonacci(int n) {
        // // base case

        // if (n == 0) {
        // return 0;
        // }
        // if (n == 1) {
        // return 1;
        // }

        // // main logic
        // return fibonacci(n - 1) + fibonacci(n - 2);
        int[] dp = new int[n + 1];
        // this array are fix now so is ko fix karna ki waja ye ha next jitni bha value
        // wo previous value ka sum hoga..
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            // this below line show the not fetch the previous just take new by using this
            // array..
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];

    }

    public static void main(String[] args) {
        int n = 6;
        int result = fibonacci(n);
        System.out.print("Fibonacci Number at position: " + n + " is: " + result);
    }

}
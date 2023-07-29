package Recursion;
//Time Complexity:O(2^n)
/*Space complexity : O(N), as we are using recursion stack to store all intermediate results*/

public class Fibonacci {
    public static void main(String[] args) {
        int n=7;
        int result=fibonacci(n);
        System.out.println("The "+n+"th term of the series is: " +result);
    }

    public static int fibonacci(int n) {
        if(n<=1){                        //Base condition
            return n;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);      //Recursive call
        }
    }
}

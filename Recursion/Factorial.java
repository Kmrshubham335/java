package Recursion;
//TIME COMPLEXITY:O(n).
public class Factorial {
    public static void main(String[] args) {
        int n=5;
        int result =FactorialNum(n);
        System.out.println("The factorial of "+n+" is: " +result );
    }

    public static int FactorialNum(int n) {
        if (n ==1 || n==0){         //base condition
            return 1;
        } 
        else{
            return n*FactorialNum(n-1);   //recursive call
        }      
    }
}
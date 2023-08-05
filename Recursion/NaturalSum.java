package Recursion;

public class NaturalSum {
    public static void main(String[] args) {
        int n=10;
        int result =FindSum(n);
        System.out.println("Sum of number " + result);
    }

    private static int FindSum(int n) {
        if(n==1){
            return 1;
        }
        else{
            int sum1=FindSum(n-1);
            int sn=n+sum1;
            return sn;
        }
        }
}

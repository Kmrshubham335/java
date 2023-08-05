package Recursion;
//sum of digit by recursion
//Time complexity:O(log n)
//Space complexity:O(log n)
public class sum {
    public static void main(String[] args) {
        int n=1234;
        int result = SumofDigit(n);
        System.out.println("Sum of Digits is: "+result );
    }

    public static int SumofDigit(int n) {
        if(n==0){
            return  0 ;
        }
        else{
            return (n%10+SumofDigit(n/10));
        }
    }
}

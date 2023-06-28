package Javaprogram;
public class rangepalindrome {
    public static void main(String[] args) {
        int min=50;
        int max=100;
        int i=0;
       int  n=55;
       int rem=0,sum=0,temp;
       temp=n;
       for(i=min;i<=max;i++){
        while(n!=0){
            rem=n%10;
            sum=sum*10+rem;
            n=n/10; 
        }
        if(temp==sum)
        System.out.println("palindrome number:" + sum);
       }
    }
}

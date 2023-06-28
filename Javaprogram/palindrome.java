// given number is palindrome or not
package Javaprogram;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
    try (Scanner dis = new Scanner(System.in)) {
        int num;
        int sum=0,rem;
        System.out.println("Enter the number");
        num=dis.nextInt();
        int temp=num;
        while(num>0){
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("Given number is palindrome number");}
        else{
            System.out.println("Given number is not a palindrome number");

        }
    }
    }
    }

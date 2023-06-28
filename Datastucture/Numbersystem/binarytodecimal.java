package Datastucture.Numbersystem;
import java.util.Scanner;
public class binarytodecimal {
   public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int num ,rem;
    int binary=0,i=0;
    System.out.println("Enter the binary number:");
    num=s.nextInt();
    while(num!=0){
      rem=num%10;
      num/=10;
      binary+=rem*Math.pow(2,i);
      ++i;
    }
    System.out.print(binary);
   } 
}

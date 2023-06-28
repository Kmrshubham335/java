package Javaprogram;
import java.util.Scanner;
public class evenorodd {
    public static void main(String[] args) {
     try (Scanner dis = new Scanner(System.in)) {
        System.out.println("Enter a number");
         int n= dis.nextInt();
         if(n%2==0){
            System.out.println("Given number = " +n + "is even number");
         }   
         else{
            System.out.println("Given number is = " + n + "is odd number");
         }
    }
    }
}

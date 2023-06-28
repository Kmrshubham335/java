package Javaprogram;
import java.util.Scanner;
public class fact {
    public static void main(String[] args) {
        try (Scanner dis = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int n=dis.nextInt();
            int factorial=1;
            for(int i=1; i<=n;i++){
                factorial*=i;
            }
            System.out.println("Factorial of the given number ="+n + "is " + factorial );
        }
    }
}

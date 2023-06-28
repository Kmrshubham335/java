package Datastucture.Numbersystem;
import java.util.Scanner;
//checking even or odd with bitwise operator
public class bitwiseevenodd {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int num;
            System.out.println("Enter the number");
            num=s.nextInt();
            if((num&1)==0){
                System.out.println("even number");
            }
            else
            System.out.print("odd");
        }
        
    }
}

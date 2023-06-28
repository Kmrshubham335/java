// given year is leap year is not
package Javaprogram;
import java.util.Scanner;
public class leap {
    public static void main(String[] args) {
        try (Scanner dis = new Scanner(System.in)) {
            System.out.println("Enter a year");
            int num=dis.nextInt();
            if(num%4==0 || num%400==0 || num%100==0){
                System.out.println("Given leap year is true");
            }
            else{
                System.out.println("Given leap is not a leap year");
            }
        }
    }
}

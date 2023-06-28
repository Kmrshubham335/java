// Guess the number game
package Javaprogram;
import java.util.Scanner;
public class guess {
  public static void main(String args[]) {
    try (// Write your code here...
    Scanner dis = new Scanner(System.in)) {
        int randomNum=(int)(Math.random()*(10*1));
        //  0.5*10=5.0 converted into int =5 
        int guess=dis.nextInt();
        int count=1;
        while(guess != randomNum){
            System.out.println("Try again");
            guess=dis.nextInt();
            count++;
        }
        System.out.println("Good job" + "Total Take" + count);
    }
  }
}


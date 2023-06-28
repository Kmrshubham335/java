package Javaprogram;
import java.util.Scanner;
public class vowel {
    public static void main(String[] args) {
        try (Scanner dis = new Scanner(System.in)) {
            System.out.println("Enter a character");
            char ch=dis.next().charAt(0);
            // vowel in lower case
            if(ch =='a' || ch=='e'|| ch=='i' || ch=='o'|| ch=='u'){
                System.out.println(true);
            }
            // vowel in upper case
            else if(ch=='A' || ch=='E' ||ch=='I'|| ch=='O'|| ch=='U'){
                System.out.println(true);}
            else{
            System.out.println(false);}
        }
    }
}

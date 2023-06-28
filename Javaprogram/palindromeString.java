package Javaprogram;
import java.util.Scanner;
public class palindromeString {
    public static void main(String[] args) {
        try (Scanner dis = new Scanner (System.in)) {
            String str ,reverseString="";
            System.out.println("Enter the String");
            str=dis.nextLine();
            int len;
            len=str.length();// calculate the length of the given string
            for(int i=0;i<len;i++){
                reverseString=reverseString+str.charAt(i);
            }
            if (str.toLowerCase().equals(reverseString.toLowerCase())) {
                System.out.println(str + " is a Palindrome String.");
              }
              else {
                System.out.println(str + " is not a Palindrome String.");
              }
        }
    }

    
}

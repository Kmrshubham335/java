package Datastucture.Numbersystem;
import java.util.Scanner;;
public class decimaltobinary {
    public static void main(String[] args) {
         try (Scanner s = new Scanner(System.in)) {
            String str="";
            System.out.println("Enter the number:");
            int n=s.nextInt();
            while(n>0){
                int rem=n%2;
                n=n/2;
                str=rem+str;
        }
        System.out.print(str);
        }
    }  
}

package Exceptionhandeling.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionthird {
    public static void main(String[] args) {
        Scanner dis=new Scanner(System.in);
        try {
            int num=dis.nextInt();   
        }
        catch(InputMismatchException e){
            System.out.println("Enter the integer type value not string " +e);
        }
        finally{
            dis.close();
            System.out.println("resource close");
        }
    }
}
// finally is used to close the resource from the scanner class
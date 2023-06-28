package Exceptionhandeling.Exception;

public class Exceptionfirst {
    public static void main(String[] args) {
        // normal statement
        int num1=6;
        int num2=2;
        int result=0;
        try {
            // critical statement means which statement can give a error.
            result=num1/num2;
            System.out.println("In the try block ");
        } catch (Exception e) {
            // TODO:handle exception
            System.out.println("something went wrong" + e);
        }
        System.out.println("bye");
        System.out.println(result);


    }
    
}

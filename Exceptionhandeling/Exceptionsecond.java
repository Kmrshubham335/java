package Exceptionhandeling;
public class Exceptionsecond {
    public static void main(String[] args) {
        int num1=6;
        int num2=2;
        int result=0;
        int arr[] ={4,5,6,7};
        String str=null;
        try{
            result=num1/num2;
            System.out.println(arr[2]);
            System.out.println(str.length());
        }
        catch(ArithmeticException e){
            System.out.println("You cannot divide number with zero" + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array size is 4" +e);
        }
        catch(NullPointerException e){
            System.out.println("length can't be found because string is null " + e);
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println(result);
        System.out.println("bye");
        }
}

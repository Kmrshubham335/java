package Array;
import java.util.Scanner;
// input value in array from the Scanner class
public class array1 {
    public static void main(String[] args) {
        try (Scanner dis = new Scanner(System.in)) {
            int x,i;
            int a[];
            System.out.println("Enter the number of element to put in array");
            x=dis.nextInt();
            a= new int[x];
            for(i=0;i<x;i++){
            a[i]=dis.nextInt();
            }
            for(i=0;i<x;i++){
            System.out.println("Number in array are :"+ a[i]);}
        }
    }
}

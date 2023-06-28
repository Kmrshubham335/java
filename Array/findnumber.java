package Array;
// program to find the first occurrences of the number in array
import java.util.Scanner;

public class findnumber {

    public static void main(String[] args) {
        try (Scanner dis = new Scanner(System.in)) {
            int [] arr=new int[]{1,2,3,4,5,6,0};
            int x;
            int i;
            System.out.println("Hey what element you want to find");
            x=dis.nextInt();
            for(i=0;i<arr.length;i++){
                if(arr[i]==x){
                    System.out.println("Found at index:" + i + "and number is"+arr[i]);
                }
            }
        }
        } 
}

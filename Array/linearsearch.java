package Array;
import java.util.Scanner;
// Linear search 
public class linearsearch {
    public static void main(String[] args) {
        try (Scanner dis = new Scanner(System.in)) {
            int []a = new int[20];
            int i,sn,n;
            System.out.println("Enter the number of element you want to enter in array");
            n=dis.nextInt();
            for(i=0;i<n;i++){
                a[i]=dis.nextInt();
            }
            System.out.println("enter the element you want to search");
            sn=dis.nextInt();
            for(i=0;i<n;i++){
                if(a[i]==sn){
            System.out.println("Search number found:" +a[i]);
            break;}
                }
                if(i==n)
                System.out.println(sn +  "isn't present in array.");
        }
        }
    }



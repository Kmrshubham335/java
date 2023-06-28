package Array;
import java.util.Scanner;
// bubble sort
public class bubblesort {
    public static void main(String[] args) {
        try (Scanner dis = new Scanner(System.in)) {
            int []a=new int[30];
            int i,j,n;
            System.out.println("Enter the number of element you want enter in the array");
            n=dis.nextInt();
            System.out.println("Enter" +n+ "element in the array");
            for(i=0;i<n;i++){
                a[i]=dis.nextInt();
            }
            for(i=0;i<n-1;i++){
                for(j=0;j<n-i-1;j++){
                    if(a[j]>a[j+1]){
                        int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            }
            System.out.println("Sorted array:");
            for(i=0;i<n;i++){
                System.out.print(a[i] + " ");
                System.out.println( );
            }
        }

    }
}

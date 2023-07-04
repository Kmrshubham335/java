import java.util.*;
public class create_2D {
    public static void main(String[] args) {
    Scanner dis=new Scanner (System.in);
    int i,j,r,c;
    System.out.println("Enter the number of row ");
    r=dis.nextInt();
    System.out.println("Enter the number of column");
    c=dis.nextInt();
    //creating a 2d array with size as per user input
    int[][] arr=new int[r][c];
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
           arr[i][j]=12;

        }
    }
    System.out.println("2-D array is:");
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            System.out.println(arr[i][j] + " ");
            System.out.println(" ");
        }
    }

    }    
}

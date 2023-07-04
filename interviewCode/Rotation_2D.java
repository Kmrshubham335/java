//Time Complexity:O(n^2)
//space Complexity:O(1)
//Rotation of the 2d array in clockwise direction


package interviewCode;
import java.util.*;

public class Rotation_2D {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{5,6,7},{8,9,10},{11,12,13},{14,15,16}};

        //calling the function
        rotatedmatrix(arr);
        //Displaying
        for(var mat:arr){
            System.out.println(Arrays.toString(mat));
        }
        }

    public static void rotatedmatrix(int[][] arr) {
        //Transpose of the array
        for(int i=0;i<arr.length;i++){

            // j=0 cant be possible because we cannot swap 2 time in array it will give the original array.
            for(int j=i;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        // swap the left and right column
        for(int i=0;i<arr.length;i++){
            int left =0;
            int right=arr[i].length-1; //Initialize right as the rightmost column index
            
            while(left<right){
                int temp=arr[i][left];
            arr[i][left]=arr[i][right];
                arr[i][right]=temp;  
            }
        }

    }
}

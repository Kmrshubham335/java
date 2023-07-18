//Lower bound or the first occurrence of the array based on the binary search
package interviewCode;
import java.util.*;
public class lowerBound {
    public static void main(String[] args) {
        try (Scanner dis = new Scanner(System.in)) {
            System.out.println("Enter the number of element in the array ");
            int n =dis.nextInt();
            System.out.println("Enter the element in array");
            int []arr=new int[n];
            for (int i = 0 ;i<n;i++){
                arr[i]=dis.nextInt();
   }
   System.out.println("Enter the target value to search");
   int target = dis.nextInt();
   int result = firstoccurrence(arr,target);
   if(result!=-1){
            System.out.println("first occurrence of  element is found at location " + result);
   }
   else{
            System.out.println("Element not Found!");
   }
        }
}

    public static int firstoccurrence(int[] arr, int target) {
        int low=0;int high= arr.length-1;
        int result=-1;
        while(low<=high){
            // to avoid overflow
            int mid= low+(high-low)/2;      
            if(arr[mid]==target){
                result=mid;
            //we want to know the lower bound of the element,so we need to traverse the left side of the array
                high=mid-1;                  
            }
            if(arr[mid]>target){
                low=mid+1;                 
            }
            else{
                high=mid-1;      
        }
    }
    return result;

}
}
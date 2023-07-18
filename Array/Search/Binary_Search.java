package Array.Search;
import java.util.*;
public class Binary_Search {
    public static void main(String[] args) {
        Scanner dis =new Scanner(System.in);
        System.out.println("Enter the number of element in the array ");
        int n =dis.nextInt();
        System.out.println("Enter the element in array");
        int []arr=new int[n];
        for (int i = 0 ;i<n;i++){
            arr[i]=dis.nextInt();
    }
    System.out.println("Enter the target value to search");
    int target = dis.nextInt();
    int result = binarysearch(arr,target);
    if(result!=0){
        System.out.println("element is found at location " + result);
    }
    else{
        System.out.println("Element not Found!");
    }
}

    public static int binarysearch(int[] arr, int target) {
        int low=0;int high= arr.length-1;
        while(low<=high){
            int mid= low+(high-low)/2;      // Calculate the middle index
            if(arr[mid]==target){
                return mid;                  // Element found at index mid
            }
            if(arr[mid]<target){
                low=mid+1;                  //    Move to the right side of the middle element (higher values)
            }
            else{
                high=mid-1;      // // Move to the left side of the middle element (lower values)
        }
    }
    return 0;

}
}
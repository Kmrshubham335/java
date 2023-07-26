package Array.Sorting;

public class Insertion_for_Partially_SortedArrays {
    public static void main(String[] args) {
        int arr[]={10, 5, 12, 8, 15, 14, 16};
        insertionSortForPartialArray(arr);
        System.out.println("After sorting:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public  static void insertionSortForPartialArray(int[] arr) {
        for (int i=0;i<arr.length;i++){
            int j=i;
            while(j>0&&arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
}

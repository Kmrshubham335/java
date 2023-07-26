package Array.Sorting;
//Time complexity = O(n)
//If array is almost or already sorted we will used insertion sort.
public class Insertion {
    public static void main(String[] args) {
        int arr[]={20,30,50,90,5,15};
        insertionSort(arr);
        System.out.println("Sorted array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static  void insertionSort(int arr[]){
        for (int i =1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                //swap the element
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
}
}

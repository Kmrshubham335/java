package Array.Sorting;  
public class Selection {
    public static void main(String[] args) {
        int arr[]={50,25,38,44,99,16,11,21};
        selectionSort(arr);
        System.out.println("Sorted elements:");
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            // Find the minimum element in remaining unsorted array
            int minIndex = i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
            }
        }
            // Swap the found minimum element with the first element
            if(arr[minIndex]!=i){
                int temp=arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;
            }
    }
}
}
package Array.Sorting;

public class Bubblesort {
    public static void main(String[] args) {
        int arr[]={70,30,20,10,5,90};
        BubbleSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i){
            System.out.print(arr[i]+" ");
        }
    }
    public static void BubbleSort(int arr[]){
        boolean swapped=false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped= true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }
}

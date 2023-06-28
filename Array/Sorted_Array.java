package Array;

public class Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2};
        int i,j=0;
        for (i = 0; i < arr.length; i++) {
            if(arr[i]!=arr[j]){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    j++;
                    }
                   
                }
            }
    for (int k = 0; k < arr.length; k++) {
        System.out.println(arr[k]);
}
}
}

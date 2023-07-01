package Array;
// finding the Duplicate element in the array
public class duplicate 
{
    public static void main(String[] args) {
        int arr[]={1,2,2,2,3,5};
        int n = arr.length;
        for (int i = 0 ;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]==arr[j])){
                    System.out.print(arr[i]);
            }
    }
}
}
}
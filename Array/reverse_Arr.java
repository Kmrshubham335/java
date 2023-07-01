package Array;
//Reversed the array
public class reverse_Arr {
    public static void main(String[] args) {
        int arr[]={2,5,3,4,9,10};
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            //swapping the element 
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.println("Reversed array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

}

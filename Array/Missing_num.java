package Array;
//missing element in the array
//Time complexity:O(n)
public class Missing_num {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        int sum_arr=0;
        int n=arr.length;

        //Calculating the n+1 element 
        int sum =((n+1)*(n+2))/2;
        for(int i=0;i<n;i++){
            sum_arr+=arr[i];
        }
        int missing;
        missing=sum-sum_arr;
        System.out.println("Missing element in array is: " + missing);
    }
}
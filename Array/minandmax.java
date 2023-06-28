package Array;
// finding the minimum and maximum value in the array
public class minandmax { 
    public static void main(String[] args) {
        int arr[]={4,2,0,8,20,9,2};
        findminandmax(arr);

    }   
    static void findminandmax(int arr[]){
        if(arr==null || arr.length==0) return ;
        // array is null and array length is 0 it will return the function 
        // No output
        int max=arr[0];
        int min=arr[0];
        for( int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum:" + max);
        System.out.println("Minimum:" + min);
    }
}

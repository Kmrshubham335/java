package Array;
//check if the array is sorted or not and return boolean value 
//Time complexity:-O(n)
public class sortedarray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
    boolean result= Sortedarray(arr);
    System.out.println(result);
    }
    public static boolean Sortedarray(int[]arr) {
         boolean b=true;
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                b= false;
                break;
            }
        }
        return b;
    }
}


package Array;

public class Nondesc {
    public static void main(String[] args) {
        int arr[]={3,4,2,5};
        for (int i = 1 ;i<arr.length-1;++i){
            if(arr[i-1]>arr[i]){
                arr[i-1]=i;
            }
            else if (arr[i-1]<arr[i]){
                arr[i-1]=i;
            }
    }
   System.out.println("Non descending array");
   for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
   }
    
}
}

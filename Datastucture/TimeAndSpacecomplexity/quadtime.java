package Datastucture.TimeAndSpacecomplexity;

public class quadtime {
    public static void main(String[] args) {
        int arr[]=new int[]{5,5,0,9,3,3,10,15,12,4};
        int target=10;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]+arr[i]==target){
                    System.out.println("Pairs:" + " " +arr[j] + " " + arr[i]);
                }
            }
        }
    }
}

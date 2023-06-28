package Array;
public class Move_Zero_End {
    public static void main(String[] args) {
        int[] arr = {1,0,0,3,4};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
             j=i+1;}
            while(j<arr.length && arr[j]==0){
                j++;
            }
            if(j<arr.length){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        for(int z=0;z<arr.length;z++){
            System.out.print(arr[z]);
        }
}
}
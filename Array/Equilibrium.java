package Array;
//Equilibrium point of the array.
public class Equilibrium {
    public static void main(String[] args) {
        int arr[]={1,3,5,2,2};
        int sum=0, rightsum=0;
        int i;
        for(i=0;i<arr.length;i++);{
            sum+=arr[i];
        }
        for(i=0;i<arr.length;i++){
            sum-=arr[i];
            if(arr[i]==sum){
            System.out.println("Equilibrium index is"+ i+1);
            }
            rightsum+=arr[i];
        }

    }    
}

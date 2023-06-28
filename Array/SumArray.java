package Array;
// Sum of the array
public class SumArray {
    public static void main(String[] args) {
        int[]a=new int[]{2,4,6,8};
        int i,sum=0;
        for(i=0;i<a.length;i++){
            sum=sum+a[i];
        }

        System.out.println("Sum of the array is = " +sum);
    }
}

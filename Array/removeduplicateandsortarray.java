package Array;
public class removeduplicateandsortarray {
    public static void main(String[] args) {
        int []arr={2,1,1,2,3,4,5,6,6};
        // 2 pointer approach:
        int j=0;
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[j] != arr[i]){
                // if arr[j(0)] not equal to arr[i] then we interchange or swap the number and if arr[j]==arr[i] then we will not do anything because we have to find the unique value.
                arr[++j]=arr[i];
                System.out.print(arr[i] + " ");
            }
        }
        j+=1;
    }
}

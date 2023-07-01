package Array;
public class even_Indice {
    public static void main(String[] args) {
        int arr[]={3,20,4,6,9};
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if((arr[i]%2==0)){
                System.out.println("Even Index Element is "+arr[i]);
                sum+=arr[i];
            }
        }
        System.out.println("Sum of even index element:"+sum);
    }
}

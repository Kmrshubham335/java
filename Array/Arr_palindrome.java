package Array;
//palindromic array:We traverse the array from the starting and ending index if both same then it is palindromic array  
//Time complexity =O(n), Space complexity=O(1)
public class Arr_palindrome 
{
    public static void main(String[] args){
        int arr[]={1,2,1,0};
        int flag=0;
        int n=arr.length;
        for(int i=0;i<n/2;i++)
        { 
            //dividing the array in two half and comparing it.
            
            if(arr[i]!=arr[n-1-i]){

            //arr[i]=starting index,arr[n-i-1]=ending index

                flag=1;
                System.out.println("Not Palindromic");
                break;
            }
        }
        if(flag==0)
        System.out.println("palindromic array");
    }
}

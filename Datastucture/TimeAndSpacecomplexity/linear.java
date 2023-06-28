package Datastucture.TimeAndSpacecomplexity;
public class linear {
    public static void main(String[] args) {
        int arr[]={1,23,4,5,6,65};
        arr[0]+= 28; //O(1)| Space comp.=O(1)
        System.out.println(arr[0]); //O(1)
        for(int i=0;i<arr.length;i++) // time complexity:- O(n)
        {
            System.out.println(arr[i]);
        }
        //copy array element in new array

         int newArr[]=new int[arr.length]; //time complexity=O(1)| space complexity=O(n)

         for(int i=0;i<arr.length;i++){ //time complexity=O(n) || space complexity=O(1)
            newArr[i]=arr[i];
         }
         for (int num : newArr) { //time complexity=O(n),Space complexity=O(1)
            System.out.println(num);
         }
         //Overall 
        //  Time complexity= 1+1+n+n+n=O(3n)=O(3*n)=O(n)
        // space complexity=O(n)
    }

}
//total time complexity old = O(1) + O(1) +O(n)=O(n){we can ignore the order of 1}
//Space complexity old =O(1) i.e-i.

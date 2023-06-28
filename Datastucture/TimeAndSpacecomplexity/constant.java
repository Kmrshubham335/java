package Datastucture.TimeAndSpacecomplexity;
public class constant {
    public static void main(String[] args) {
        int arr[]={1,23,4,5,6,65};
        // add 25 to first position
        arr[0]+=25;
        // -> Time complexity:O(1)->constant
        System.out.println(arr[0]);
        // -> Time complexity:O(1)
        int num=199;
        // Space complexity-> 4(bytes)
        arr[2]+=num;
        System.out.println(arr[2]);
        // time complexity -> O(2)=order of 2       
    }
    // O(4 bytes)==O(1) constant space complexity
}

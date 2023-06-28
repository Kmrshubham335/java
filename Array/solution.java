package Array;

class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j;
        for(j=0;j<nums.length;i++){
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];
                j++;
            }
            else
            {
                j++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        Removeduplicate(1,3,4,5,3,4);
    }
    private static void Removeduplicate(int i, int j, int k, int l, int m, int n) {
    }
}

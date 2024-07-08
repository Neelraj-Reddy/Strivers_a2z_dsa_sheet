class Solution {
    public int missingNumber(int[] nums) {
        int value = ((nums.length)*(nums.length+1)/2), actual_sum = 0; 
        for(int i =0;i<nums.length;i++) actual_sum+=nums[i];
        return value-actual_sum;
    }
}
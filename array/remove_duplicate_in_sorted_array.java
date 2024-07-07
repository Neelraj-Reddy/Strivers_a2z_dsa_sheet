class Solution {
    public int removeDuplicates(int[] nums) {
        int past=nums[0], past_index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>past){
                nums[past_index+1]=nums[i];
                past_index++;
                past=nums[i];

            }
        }
        return past_index+1;
        
    }
}
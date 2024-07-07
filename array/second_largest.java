public class second_largest {
    public static void main(String[] args) {
        int[] nums={7,7,7,7,7,7,7,7,1};
        int smallest = Integer.MIN_VALUE,largest = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                smallest=largest;
                largest=nums[i];
            }
            if(nums[i] > smallest && nums[i]<largest){
                smallest=nums[i];
            }
        }
        System.out.println(smallest);

    }
}

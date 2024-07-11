class kadanes_algo {
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum =0;
        int start_max = -1, end_max = -1, start=0;
        for(int i=0;i<nums.length;i++){

            if (sum ==0){
                start = i;
            }
            sum+=nums[i];
            if(sum>max){
                max = sum;
                start_max=start;
                end_max=i;
            }
            if (sum<0){
                sum = 0;
            }
        }

        for(int i=start_max;i<end_max+1;i++){
            System.out.print(nums[i]+" ");
        }

        System.out.println();
        return max;

    }

    public static void main(String[] args) {
        int [] nums = {-2,-3,4,-2,-2,1,5,-3};
        System.out.println(maxSubArray(nums));
    }
}
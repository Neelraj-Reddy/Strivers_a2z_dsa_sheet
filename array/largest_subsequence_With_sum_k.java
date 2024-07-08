import java.util.HashMap;

public class largest_subsequence_With_sum_k {
    public static void main(String[] args) {
        int[] nums={0,0,0,0,0,0,0,0,0,0,0,0,0};
        int k = 0, len =0,sum =0;
        HashMap<Integer,Integer> pre_sum = new HashMap<>();

        for(int i=0; i<nums.length;i++){
            sum+=nums[i];
            if(sum==k){
                len = i+1;
            }
            if(pre_sum.containsKey(sum-k)){
                if(len<i-pre_sum.get(sum-k)){
                    len = i-pre_sum.get(sum-k);
                }
            }

            if(!pre_sum.containsKey(sum)){
                pre_sum.put(sum,i);
            }

        }

        System.out.println(len);
    }
    
}

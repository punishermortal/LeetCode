class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int cursum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(sum>0){
                sum+=nums[i];
            }else{
                sum=nums[i];
            }
            cursum=Math.max(cursum,sum);
        }
        return cursum;
    }
}
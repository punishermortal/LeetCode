class Solution {
    public int maxSubArray(int[] nums) {
        //variable sum which store the sum  of value of array
        int sum = nums[0];
        //beatsum
        int beat_sum = nums[0];
        for(int i=1;i<nums.length;i++){
            //when sum will be positive only then it will be added otherwise new current 
            //sum will be start from that index
            if(sum>0){
                sum+=nums[i];
            }else{
                sum=nums[i];
            }
            //update the ans only if it beat the current sum
            beat_sum=Math.max(beat_sum,sum);
        }
        return beat_sum;
    }
}
class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int[]left=new int[nums.length];
        int[]right=new int[nums.length];
        int[]ans=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(i==0){
                left[i]=0;
            }else{
                left[i]=sum-nums[i];
            }
        }
        sum=0;
        for(int i=nums.length-1;i>=0;i--){
            sum+=nums[i];
            if(i==nums.length-1){
                right[i]=0;
            }else{
                right[i]=sum-nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(left[i]-right[i]);
        }
        return ans;
    }
}
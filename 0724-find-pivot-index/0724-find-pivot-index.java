class Solution {
    public int pivotIndex(int[] nums) {
        //length of the array
        int n=nums.length;
        //sum is created for storing sum of nums array
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        //lsum =leftsum of array and rsum is righsum of array
        int lsum=0;
        int rsum=0;
        for(int i=0;i<n;i++){
            lsum+=nums[i];
            rsum=sum-lsum;
            //leftsumexpect curr index is lsum-num[i]
            if(lsum-nums[i]==rsum){
                return i;
            }
        }
        return -1;
    }
}
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int j=0;
        int i=0;
        double s=0;
        double ans=Integer.MIN_VALUE;
        while(i<n){
            s+=nums[i];
            i++;
            //calculation of ans
            
            if(i-j>k){
                s-=nums[j];
                j++;
            }
            if(i-j==k){
                double temp = s;
                ans=Math.max(ans,temp/k);
            }
        }
        return ans;
    }
}
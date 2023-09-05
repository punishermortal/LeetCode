class Solution {
    public void moveZeroes(int[] nums) {
        // int val=0;
        // for(int i:nums){
        //     if(i!=0){
        //         nums[val]=i;
        //         val++;
        //     }
        // }
        // while(val<=nums.length - 1){
        //     nums[val]=0;
        //     val++;
        // }
        int nonZeroIndex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(nonZeroIndex != i){
                    //swap
                    int temp=nums[nonZeroIndex];
                    nums[nonZeroIndex]=nums[i];
                    nums[i]=temp;
                }
                nonZeroIndex++;
            }
        }
    }
}
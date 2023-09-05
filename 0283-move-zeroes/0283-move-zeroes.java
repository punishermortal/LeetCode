class Solution {
    public void moveZeroes(int[] nums) {
        int val=0;
        for(int i:nums){
            if(i!=0){
                nums[val]=i;
                val++;
            }
        }
        while(val<=nums.length - 1){
            nums[val]=0;
            val++;
        }
    }
}
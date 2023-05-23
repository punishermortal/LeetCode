class Solution {
    public void sortColors(int[] nums) {
        int start=0;
        int end = nums.length-1;
        while(start < end){
            //move from the last index till 2 will not be comming
            while(start<end && nums[start]!=2){
                start++;
            }
            //same way we skip 1 and 2 ansd when we get 2 there we will stop
            while(start <end && nums[end]==2){
                end--;
            }
            //swap the vale from starting which is 2 ,swap with last index
            int te=nums[start];
            nums[start]=nums[end];
            nums[end]=te;
        }
        start=0;
        //there is a edge case when only 2 element will be in array the it will be fail so move end 1 back
        if(nums[end]==2)end--;
      //  same way sort the all 1 after 0
        while(start<end){
            while(start <end && nums[end]==1){
                end--;
            }
            while(start<end && nums[start]!=1){
                 start++;
             }
             int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
        }
    }
}
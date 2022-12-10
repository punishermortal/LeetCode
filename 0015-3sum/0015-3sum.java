class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i > 0 && nums[i] == nums[i - 1]){    //If number is getting repeated, ignore the
                 continue;                           //lower loop and continue.   
            }
            int start=i+1;
            int end=n-1;
            while(start<end){
                if(nums[i]+nums[start]+nums[end]>0){
                    end--;
                }
                else if(nums[i]+nums[start]+nums[end]<0){
                    start++;
                }else{
                    list.add(new ArrayList(Arrays.asList(nums[i],nums[start],nums[end])));
                    int last_start = nums[start] , last_end = nums[end]; 
                    //Now again, to avoid duplicate triplets, we have 
                    //to navigate to last occurences of num[low] and 
                    //num[high] respectively
                     // Update the low and high with last occurences of
                    //low and high.
                    while(start < end && nums[start] == last_start){  
                        start++;
                    }
                    while(start < end && nums[end] == last_end){
                        end--;
                    }
                }
            }
        }
        return list;
    }
}
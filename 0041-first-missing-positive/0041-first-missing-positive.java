class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int i=0;
        //by using cyclic sort sort the array
        while(i<n){
            //if at ith index element is less than 0 and the element is 
            //greater than length of array then skip it else sort them by 
            //using cyclic sort
            if(nums[i]<=n && nums[i]>0){
                int currval=nums[i];
                //current value ka correct index pe ka element
                int currValuekaIndex=nums[nums[i]-1];
                if(currval != currValuekaIndex){
                    swap(nums,i,nums[i]-1);
                }else{
                    i++;
                }
            }else{
                i++;
            }
        }
        //find the missing number
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return n+1;
    }
    //method used to be swap two number in array
    public void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
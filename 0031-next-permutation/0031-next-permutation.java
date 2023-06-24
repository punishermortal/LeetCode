// one of brutforce approch came in my mind (1)first generate all posible permutation and store it in 2d arraylist (2)next traverse the 2d arraylist and find the next greatervalue which is your next permutaion and that is your answer 


// opptimize approch for that problem is below Enjoy :)
class Solution {
    public void nextPermutation(int[] nums) {
        //traverse the array from last and find first element 
        // when that condition satisfied arr[i]<arr[i+1] note bro traverse from last
        int n=nums.length;
        int firstIndex=-1;
        //finding the breakpoint
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                firstIndex=i;
                break;
            }
        }
        //if not find breakpoint then reverse the array and return
        if(firstIndex==-1){
            firstIndex=0;
            while(firstIndex<n-1){
                // swap
                int tempp=nums[firstIndex];
                nums[firstIndex]=nums[n-1];
                nums[n-1]=tempp;
                firstIndex++;
                n--;                
            }
        }else{
            int secondIndex=-1;
            //find smallest greater thand breakpoint element
            int firstIndexElement=nums[firstIndex];
            for(int i=n-1;i>=0;i--){
                if(nums[i]>nums[firstIndex]){
                    secondIndex=i;
                    break;
                }
            }
            //swap
            int temp=nums[firstIndex];
            nums[firstIndex]=nums[secondIndex];
            nums[secondIndex]=temp;
            //reverse from (firstIndex+1,lastIndex)
            while(firstIndex+1<n-1){
                // swap
                int tempp=nums[firstIndex+1];
                nums[firstIndex+1]=nums[n-1];
                nums[n-1]=tempp;
                firstIndex++;
                n--;                
            }
        }       
    }
}
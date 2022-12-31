class Solution {
    public int[] nextGreaterElements(int[] nums) {
        //n is the length of nums and a array ans will be created for storing ans
        int n=nums.length;
        Stack<Integer>st=new Stack<>();
        int[]ans=new int[n];
        
        //initial push all element except last element in array because
        //we are cheacking it from last
        for(int i=n-2;i>=0;i--){
            st.push(nums[i]);
        }
        //calculation of ans
        for(int i=n-1;i>=0;i--){
            while(!st.empty() && nums[i]>=st.peek()){
                st.pop();
            }
            if(st.empty()){
                ans[i]=-1;
            }else{
                ans[i]=st.peek();
            }
            st.push(nums[i]);
            
        }
        return ans;
    }
}
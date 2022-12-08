class Solution {
    public int maxArea(int[] arr) {
        int n= arr.length;
        int start=0;
        int end=n-1;
        int ans=0;
        while(start<end){
            //calculation of answer
            ans=Math.max(ans,Math.min(arr[start],arr[end]) * (end-start));
            //now ab mover kro pointers ko
            if(arr[start]<=arr[end]){
                start++;
            }else{
                end--;
            }
        }
        return ans;
    }
}
class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        //craeate a array which store next greater element
        int[]rightPrefix=new int[n];
        //at starting from right mx=0
        int mx=arr[n-1];
        rightPrefix[n-1]=mx;
        for(int i=n-2;i>=0;i--){
            mx=Math.max(mx,arr[i]);
            rightPrefix[i]=mx;
        }
        //creat a arr for next greater in left
        int[]leftPrefix=new int[n];
        //at starting from left mx=0
        int maxx=arr[0];
        leftPrefix[0]=maxx;
        for(int i=1;i<n;i++){
            maxx=Math.max(maxx,arr[i]);
            leftPrefix[i]=maxx;
        }
        //now calculating and from traversing each index of height
        int ans=0;
        // System.out.print(Arrays.toString(leftPrefix));
        // System.out.print(Arrays.toString(rightPrefix));
        for(int i=1;i<n-1;i++){
            int val=Math.min(leftPrefix[i-1],rightPrefix[i+1]);
            if(val>arr[i]){
                ans+=(val-arr[i]);
            }
        }
        return ans;
    }
}
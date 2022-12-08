class Solution {
    public int reverse(int x) {
        long ans=0;
        boolean flag=false;
        if(x<0){
            x=-x;
            flag=true;
        }
        while(x>0){
            ans=ans*10+x%10;
            x/=10;
        }
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE){
            return 0;
        }
        if(flag){
            return (int)-ans;
        }
        return (int)ans;
    }
}
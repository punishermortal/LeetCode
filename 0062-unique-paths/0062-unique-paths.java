class Solution {
    public int uniquePaths(int m, int n) {
        int[][]dp=new int[m][n];
        for(int[]i:dp){
            Arrays.fill(i,-1);
        }
        int source =0;
        int destination =0;
        return (getPaths(dp,m,n,source,destination));
    }
    public int getPaths(int[][]dp,int row,int col,int s,int d){
        if(s>=row || d>=col){
            return 0;
        }
        if(s==row-1 && d==col-1){
            return 1;
        }
        if(dp[s][d]!=-1){
            return dp[s][d];
        }else{
            return dp[s][d]=getPaths(dp,row,col,s+1,d)+getPaths(dp,row,col,s,d+1);
        }
    }
    public int optimalApproch(int row,int col){
        //use formula nCr
        int N=row-1+col-1;
        int r=row;
        int ans=1;
        for(int i=1;i<=r;i++){
            ans+=(N/i);
            N++;
        }
        return ans;
    }
}
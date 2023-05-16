//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String s = read.readLine();
            Solution ob = new Solution();
            
            System.out.println(ob.cuts(s));
        }
    } 
} 

// } Driver Code Ends


//User function Template for Java

class Solution{
    static boolean hai(String s,int start,int end){
        long num = 0,j=0,temp=1;
        for(int i=end;i>=start;i--){
            if(s.charAt(i)=='1'){
                num+=temp;
            }
            temp*=2;
        }
        while(num>1){
            if(num%5!=0)return false;
            num/=5;
        }
        return true;
    }
    static int help(String s,int start,int end,int dp[][]){
        if(s.charAt(start)=='0')return -1;
        if(end<start)return 0;
        if(dp[start][end]!=-1)return dp[start][end];
        if(hai(s,start,end)==true)return 1;
        int ans = Integer.MAX_VALUE;
        for(int i=start;i<=end;i++){
            if(hai(s,start,i)==true){
                int second = help(s,i+1,end,dp);
                if(second!=-1)
                ans = Math.min(ans,1+second);
            }
        }
        return dp[start][end] =  ans==Integer.MAX_VALUE?-1:ans;
    }
    static int cuts(String s)
    {
        // code here
        int n = s.length();
        int dp[][] = new int[n][n];
        for(int temp[]:dp)
        Arrays.fill(temp,-1);
        return help(s,0,n-1,dp);
    }
}

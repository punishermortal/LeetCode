//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[])throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);

            Solution ob = new Solution();
            out.println(ob.cutRod(arr, n));
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution{
     public int cutRod(int price[], int n) {
        //code here
        int dp[]=new int[n+1];
        Arrays.fill(dp,0);
        for(int i=1;i<=n;i++){
            int temp = Integer.MIN_VALUE;
            for(int j=0;j<i;j++){
                temp=Math.max(temp,price[j]+dp[i-j-1]);
            }
            dp[i]=temp;
        }
        return dp[n];
    }
}
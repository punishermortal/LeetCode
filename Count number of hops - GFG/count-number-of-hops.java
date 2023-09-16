//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG implements Runnable {
    public void run() {
        try {
            BufferedReader in;
            PrintWriter out;
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            int t = Integer.parseInt(in.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(in.readLine().trim());

                Solution g = new Solution();
                out.println(g.countWays(n));
            }
            out.close();
        } catch (Exception e) {
            ;
        }
    }

    public static void main(String args[]) throws IOException {
        new Thread(null, new GFG(), "whatever", 1 << 26).start();
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    static long ans=0;
    static long modulo = 1000000007;
    static long countWays(int n)
    {
        if(n==1) return 1;
        else if(n==2) return 2;
        else if(n==3) return 4;
        else
        {
            long arr[]=new long[n+1];
            arr[0]=1;
            arr[1]=1;
            arr[2]=2;
            //arr[3] = 4;
            for(int i=3;i<=n;i++) {
                arr[i]=arr[i-1]%1000000007+arr[i-2]%1000000007+arr[i-3]%1000000007;
            }
            return arr[n]% 1000000007;
        }
        // add your code here
        // solve(0,n);
        // long val=ans;
        // ans=0;
        // return val;
    }
    static void solve(int step,int rem){
        if(rem==0){
            ans=(ans%modulo)+1;
            return;
        }
        //for 1 step
        if(rem>=1){
            solve(step+1,rem-1);
        }
        if(rem>=2){
            solve(step+2,rem-2);
        }
        if(rem>=3){
            solve(step+3,rem-3);
        }
    }
    
}


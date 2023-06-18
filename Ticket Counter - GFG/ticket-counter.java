//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String s[]=in.readLine().trim().split(" ");
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            Solution ob=new Solution();
            out.println(ob.distributeTicket(n,k));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    public static int distributeTicket(int n,int k)
    {
        int res=0;
        boolean flag=true;
        int count=0;
        int i=1;
        while(i<=n){
            if(flag){
                res=i;
                i++;
                count++;
                if(count==k){
                    flag=false;
                    count=0;
                }
            }else{
                res=n;
                n--;
                count++;
                if(count==k){
                    flag=true;
                    count=0;
                }
            }
        }
        return res;
    }
}
//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.dominantPairs(n, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int dominantPairs(int n, int[] arr) {
        // code here
        Arrays.sort(arr,n/2,n);
        int ans=0;
        for(int i=0;i<n/2;i++){
            int index = binarySearch(arr,arr[i],n);
            if(index!=-1)ans+=(index-n/2)+1;
        }
        return ans;
    }
    
    public static int binarySearch(int arr[],int key,int n){
        int low = n/2, high = n-1, mid, index=-1;
        while(low<=high){
            mid = (low+high)/2;
            if(5*arr[mid]<=key){
                index=mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        return index;
    }
}
        

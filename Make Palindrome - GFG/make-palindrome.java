//{ Driver Code Starts
import java.io.*;
import java.util.*;


class StringArray
{
    public static String[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        return s;
    }

    public static void print(String[] a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<String> a)
    {
        for(String e : a)
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
            
            
            String[] arr = StringArray.input(br, n);
            
            Solution obj = new Solution();
            boolean res = obj.makePalindrome(n, arr);
            
            String _result_val = (res) ? "YES" : "NO";
            System.out.println(_result_val);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static boolean makePalindrome(int n, String[] arr) {
        // code here
        if(n==0)return true;
        if((n==1) && checkPalidrome(arr[0])){
            return true;
        }
        HashMap<String,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(reverseStr(arr[i]))){
                hm.remove(reverseStr(arr[i]));
            }else{
                hm.put(arr[i],1);
            }
        }
        if(hm.size()==0){
            return true;
        }
        if(hm.size()>1){
            return false;
        }
        if(hm.size()==1){
            for(String i:hm.keySet()){
                if(!checkPalidrome(i)){
                    return false;
                }
            }
            return true;
        }
        return true;
    }
    public static boolean checkPalidrome(String s){
        int n=s.length();
        int i=0;
        int j =n-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    // public static String reverseStr(String s){
    //     // String st="";
    //     // for(int i=s.length()-1;i>=0;i--){
    //     //     st+=s.charAt(i);
    //     // }
    //     
    //     return st;
    // }
    public static String reverseStr(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
         }
    
        return new String(charArray);
    }
}
        

class Solution {
    public int strStr(String s, String s1) {
        //length of string s
        int n=s.length();
        
        //itterate on sting s and use startswith function for getting index
        for(int i=0;i<n;i++){
            if(s.substring(i).startsWith(s1)){
                return i;
            }
        }
        return -1;
    }
}
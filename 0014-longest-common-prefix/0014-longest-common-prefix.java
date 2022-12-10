class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        int j=0;
        String st=strs[0];
        int k=st.length();
        String ans="";
        while(j<k){
            for(int i=0;i<n;i++){
                if(strs[i].length()<=j || st.charAt(j)!=strs[i].charAt(j)){
                    return ans;
                }
            }
            ans+=st.charAt(j);
            j++;
        }
        return ans;
    }
}
//["aadog","racecar","car"]====>output ""

class Solution {
    public String longestCommonPrefix(String[] strs) {
        //length of a strs array is n
        int n=strs.length;
        //take a pointer as name j
        int j=0;
        //that is the first element in array strs
        String st=strs[0];
        //length of of string
        int k=st.length();
        //variable for storing ans
        String ans="";
        
        //lets optimize this ques ,not think of n^2 try to solve it
        //in length of first string *length of array
        while(j<k){
            for(int i=0;i<n;i++){
                //check if the length of string str[i] is less than j
                //then return ans and if char is diffrent then also return ans
                if(strs[i].length()<=j || st.charAt(j) != strs[i].charAt(j)){
                    return ans;
                }
            }
            //add the character in ans
            ans+=st.charAt(j);
            j++;
        }
        return ans;
    }
}
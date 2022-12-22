class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[]arr=s.split(" +");
        String ans="";
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            String st=arr[i].trim();
            if(i!=0){      
                ans+=st+" ";
            }else{
                ans+=st;
            }
        }
        
        return ans;
    }
}
class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int j =0;
        int count =0;
        int ans = 0;
        for(int i=0;i<n;i++){
            
            if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ){
                count++;
            }
            //first contraction
            if((i-j+1)>k){
                if(s.charAt(j)=='a' ||s.charAt(j)=='e' ||s.charAt(j)=='i' ||s.charAt(j)=='o' ||s.charAt(j)=='u'){
                    count--;
                }
                j++;
            }
            if((i-j+1)==k){
                ans=Math.max(ans,count);
            }
            
        }
        return ans;
    }
}
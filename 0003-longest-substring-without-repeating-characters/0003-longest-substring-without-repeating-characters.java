class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int ans=0;
        HashMap<Character,Integer>hm=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            //putting the value in a hashmap 
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
            //if distinct char is entered in a window then we have to remove from window 
            //so here is contarction
            while(hm.size()<(i-start+1)){
                hm.put(s.charAt(start),hm.get(s.charAt(start))-1);
                if(hm.get(s.charAt(start))==0){
                    hm.remove(s.charAt(start));
                }
                start++;
            }
            //here is a calculation of ans
            ans=Math.max(ans,(i-start+1));
            
        }
        return ans;
    }
}
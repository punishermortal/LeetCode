class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        int ans=1;
        int count=0;
        HashMap<Integer,Boolean>hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,true);
        }
        for(int i:nums){
            if(hm.containsKey(i-1)){
                hm.put(i,false);
            }
        }
        for(int i:nums){
            if(hm.get(i)){
                while(true){
                    if(hm.containsKey(i)){
                        count++;
                    }else{
                        break;
                    }
                    i++;
                    ans=Math.max(ans,count);
                }
                count=0;
            }
        }
        return ans;
    }
}
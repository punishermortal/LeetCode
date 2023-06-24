class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>first,previous=new ArrayList<>();
        for(int i=0;i<n;i++){
            first=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    first.add(1);
                }else{
                    first.add(previous.get(j-1)+previous.get(j));
                }
            }
            ans.add(first);
            previous=first;
        }
        return ans;
    }
}
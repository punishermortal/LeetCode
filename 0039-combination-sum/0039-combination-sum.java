class Solution {
    //creat a static arraylist for storing current answer
    List<Integer>list=new ArrayList<>();
    //this a global arraylist for storing those ans whis is equal to target
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        combinationSum(0,candidates,target,candidates.length);
        return ans;
    }
    public void combinationSum(int ind,int[]arr,int target,int n){
        //that is the base case when index==length of array
        if(ind==n){
            //when target equal to zero then we have a possible  one answer
            //and we add this list to our answer by copying this 
            //list,its a deep copy
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[ind]<=target){
            list.add(arr[ind]);
            combinationSum(ind,arr,target-arr[ind],n);
            //that is the abcktracking removing last element from our list
             list.remove(list.size()-1);
        }
        combinationSum(ind+1,arr,target,n);

    }
}
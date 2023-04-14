class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        int[] taken = new int[nums.length];
        permutations(0, nums, taken, res, list);
        return res;
    }
    public void permutations(int index, int[] arr, int[] taken,List<List<Integer>> res, List<Integer> list){
        if(list.size() == arr.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0;i < arr.length;i++){
            if(taken[i] == 0){
                taken[i] = 1;
                list.add(arr[i]);
                permutations(i + 1, arr, taken, res, list);
                list.remove(list.size() - 1);
                taken[i] = 0;
            }
        }
    }
}
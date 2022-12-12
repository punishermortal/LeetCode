/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    //create a globle sum variable
    int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum=0;
        rangeSumBstUtil(root,low,high);
        return sum;
    }
    //create a utility rangesum whih helps me to adding number which is in range
    public void rangeSumBstUtil(TreeNode root,int low,int high){
        if(root==null){
            return;
        }
        rangeSumBstUtil(root.left,low, high);
        //add ans to node if it lie between a range
        if(root.val>=low && root.val<=high){
            sum+=root.val;
        }
        rangeSumBstUtil(root.right,low,high);
    }
}
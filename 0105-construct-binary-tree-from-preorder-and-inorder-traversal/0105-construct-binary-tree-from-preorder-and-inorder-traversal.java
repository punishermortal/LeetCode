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
    int pindex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return utility(preorder,inorder,0,preorder.length-1);
        
    }
    public TreeNode utility(int[] preorder, int[] inorder,int start,int end){
        if(start >end)return null;
        TreeNode root=new TreeNode(preorder[pindex]);
        pindex++;
        int ind=0;
        for(int i=start;i<=end;i++){
            if(inorder[i]==root.val){
                ind=i;
                break;
            }
        }
        root.left = utility(preorder,inorder,start,ind-1);
        root.right = utility(preorder,inorder,ind+1,end);
        return root;
    }
}
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
		q.add(root);
		int k=0;
		while(!q.isEmpty()){
			int n=q.size();
			if(k%2==0){
                List<Integer>list=new ArrayList<>();
				for(int i=0;i<n;i++){
					TreeNode curr=q.remove();
					list.add(curr.val);
					if(curr.left!=null){
						q.add(curr.left);
					}
					if(curr.right!=null){
						q.add(curr.right);
					}
				}
                ans.add(list);
			}else{
				List<Integer>list=new ArrayList<>();
				for(int i=0;i<n;i++){
					TreeNode curr=q.remove();
					list.add(curr.val);
					if(curr.left!=null){
						q.add(curr.left);
					}
					if(curr.right!=null){
						q.add(curr.right);
					}
				}
                Collections.reverse(list);
                ans.add(list);
			}
			k++;
		}
        return ans;
    }
}
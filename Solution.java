/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
       if (root==null || root == p || root == q){
           return root;
       }
       TreeNode chkleft = lowestCommonAncestor(root.left, p, q);
       TreeNode chkright = lowestCommonAncestor(root.right, p, q);
       if(chkleft==chkright){
           return null;
       }
       if(chkleft!=null && chkright!=null){
           return root;
       }
       if(chkleft!=null){
           return chkleft;
       }
       return chkright;
       
    }
}

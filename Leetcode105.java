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

    private int idx=0;

    private TreeNode solve(int[]preorder,int[]inorder,int start,int end){
        //base case 
        if(start>end) return null;

        for(int i=start;i<=end;i++){
            if(preorder[idx]==inorder[i]){
                TreeNode root=new TreeNode(preorder[idx]);
                idx++;

                root.left=solve(preorder,inorder,start,i-1);
                root.right=solve(preorder,inorder,i+1,end);

                return root;
            }
        }
        return  null;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        return solve(preorder,inorder,0,inorder.length-1);
    }
}
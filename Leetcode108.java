class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }

    private TreeNode helper(int[]nums,int start,int end){
        if(start>end){
            return null;
        }

        int mid=start+(end-start)/2;
        TreeNode n=new TreeNode(nums[mid]);
        n.left=helper(nums,start,mid-1);
        n.right=helper(nums,mid+1,end);
        return n;
    }
}
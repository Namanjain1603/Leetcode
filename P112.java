public class P112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        } else if (root.val == targetSum && root.left == null && root.right == null) {
            return true;
        }else {
            targetSum-=root.val;
            return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
        }
    }
}

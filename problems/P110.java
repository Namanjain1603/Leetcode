import topics.*;

public class P110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int l = height(root.left);
        int r = height(root.right);
        return Math.abs(l - r) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left) + 1;
        int rh = height(root.right) + 1;
        return Math.max(lh, rh);
    }
}

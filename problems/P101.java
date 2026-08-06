package problems;

import topics.TreeNode;

public class P101 {
    public static boolean isSymmetric(TreeNode root) {
        return helper(root.left, root.right);

    }

    public static boolean helper(TreeNode lr, TreeNode rr) {
        if (lr == null && rr == null) {
            return true;
        }
        if (lr == null || rr == null) {
            return false;
        }
        if (lr.val != rr.val) {
            return false;
        }
        return helper(lr.right, rr.left) && helper(lr.left, rr.right);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -1, -1, 4, -1, -1, 2, 4, -1, -1, 3, -1, -1 };
        TreeNode.idx = -1;
        TreeNode root = TreeNode.createTreeNode(arr);
        System.out.println(isSymmetric(root));

    }
}

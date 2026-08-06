package problems;

import topics.TreeNode;

public class P104 {
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = maxDepth(root.left) + 1;
        int r = maxDepth(root.right) + 1;
        return Math.max(l, r);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 9, -1, -1, 20, 15, -1, -1, 7, -1, -1 };
        TreeNode.idx = -1;
        TreeNode root = TreeNode.createTreeNode(arr);
        System.out.println(maxDepth(root));
    }

}

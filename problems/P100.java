package problems;

import topics.TreeNode;

public class P100 {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        int[] p = { 1, 2, -1, -1, 3, -1, -1 }, q = { 1, 2, -1, -1, 3, -1, -1 };
        TreeNode.idx = -1;
        TreeNode r1 = TreeNode.createTreeNode(p);
        TreeNode.idx = -1;
        TreeNode r2 = TreeNode.createTreeNode(q);
        System.out.println(isSameTree(r1, r2));
    }
}

package problems;

import java.util.ArrayList;
import java.util.List;
import topics.TreeNode;

public class P94 {
    static List<Integer> ans = new ArrayList<Integer>();

    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return ans;
        }
        inorderTraversal(root.left);
        ans.add(root.val);
        inorderTraversal(root.right);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, -1, 2, 3, -1, -1, -1 };
        TreeNode.idx = -1;
        TreeNode root = TreeNode.createTreeNode(arr);
        ans = inorderTraversal(root);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}

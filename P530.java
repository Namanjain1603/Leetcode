import java.util.ArrayList;

public class P530 {
    ArrayList<Integer> arr = new ArrayList<>();

    public ArrayList<Integer> inorder(TreeNode root) {
        if (root == null) {
            return arr;
        }
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
        return arr;
    }

    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> ans = inorder(root);
        int result = Integer.MAX_VALUE, re;
        for (int i = 0; i < ans.size() - 1; i++) {
            re = ans.get(i + 1) - ans.get(i);
            result = Math.min(re, result);
        }
        return result;
    }
}

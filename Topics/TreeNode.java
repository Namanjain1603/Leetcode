package topics;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static int idx;

    // From preorder
    public static TreeNode createTreeNode(int[] arr) {
        idx++;
        if (arr[idx] == -1) {
            return null;
        }
        TreeNode newNode = new TreeNode(arr[idx]);
        newNode.left = createTreeNode(arr);
        newNode.right = createTreeNode(arr);
        return newNode;

    }
}
import java.util.ArrayList;
import java.util.List;
import topics.*;

public class P145 {
    List<Integer> ans = new ArrayList<Integer>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return ans;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        ans.add(root.val);
        return ans;
    }
}

import java.util.ArrayList;
import java.util.List;

public class P94 {
    List<Integer> ans = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return ans;
        }
        inorderTraversal(root.left);
        ans.add(root.val);
        inorderTraversal(root.right);
        return ans;
    }
}

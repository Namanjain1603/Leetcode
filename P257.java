import java.util.ArrayList;
import java.util.List;

public class P257 {
    List<String> str = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null ) {
            return new ArrayList<>();
        }
        if(root.left==null && root.right == null){
            return str;
        }

        // str.add(root.val+"->"+binaryTreePaths(root.left));
        // str.add(root.val+"->"+binaryTreePaths(root.right));
    }
}

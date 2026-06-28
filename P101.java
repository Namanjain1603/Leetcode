public class P101 {
    public boolean isSymmetric(TreeNode root) {
        return helper(root.left, root.right);
        
    }
    
    public boolean helper(TreeNode lr,TreeNode rr){
        if(lr == null && rr == null){
            return true;
        }
        if(lr==null || rr == null){
            return false;
        }
        if(lr.val!=rr.val){
            return false;
        }
        return helper(lr.right, rr.left) && helper(lr.left, rr.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}

public class SameTree {
    // Main logic function
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // If both nodes are null, trees are identical at this point
        if (p == null && q == null) return true;
        
        // If one is null or values differ, trees are not identical
        if (p == null || q == null || p.val != q.val) return false;
        
        // Recursively check left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    // Main method for testing
    public static void main(String[] args) {
        SameTree st = new SameTree();

        // Example 1: p = [1,2,3], q = [1,2,3]
        TreeNode p1 = new TreeNode(1);
        p1.left = new TreeNode(2);
        p1.right = new TreeNode(3);

        TreeNode q1 = new TreeNode(1);
        q1.left = new TreeNode(2);
        q1.right = new TreeNode(3);

        System.out.println("Example 1: " + st.isSameTree(p1, q1)); // Output: true
    }
}
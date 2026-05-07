import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return checkMirror(root.left, root.right);
    }

    private boolean checkMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null || left.val != right.val) return false;

        // Mirror check: Outer children together, Inner children together
        return checkMirror(left.left, right.right) && checkMirror(left.right, right.left);
    }

    public static void main(String[] args) {
        SymmetricTree sol = new SymmetricTree();

        // Example 1: [1,2,2,3,4,4,3] -> Symmetric
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(4);
        root1.right.left = new TreeNode(4);
        root1.right.right = new TreeNode(3);

        // Example 2: [1,2,2,null,3,null,3] -> NOT Symmetric
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.left.right = new TreeNode(3); // This is an "inner" node
        root2.right.right = new TreeNode(3); // This is an "outer" node

        // Explicitly printing both
        System.out.println(sol.isSymmetric(root1)); 
        System.out.println(sol.isSymmetric(root2)); 
    }
}
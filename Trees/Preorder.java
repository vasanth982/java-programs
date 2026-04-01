class Preorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    private void preorder(TreeNode node, List<Integer> res) {
        if (node == null) return;

        
        res.add(node.val);           // Root
        preorder(node.left, res);     // Left
        preorder(node.right, res);    // Right
    }
}
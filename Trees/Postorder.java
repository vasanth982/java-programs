class Postorder {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorder(root, res);
        return res;
    }

    private void postorder(TreeNode node, List<Integer> res) {
        if (node == null) return;

        
        
        postorder(node.left, res);     // Left
        postorder(node.right, res);    // Right
         res.add(node.val);           // Root
    }
}
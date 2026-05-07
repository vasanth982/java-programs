//113. Path Sum II
‌
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
‌
        dfs(root, targetSum, path, result);
        return result;        
    }
‌
    private void dfs(TreeNode node, int target, List<Integer> path, List<List<Integer>> result){
        if(node==null)
        return;
‌
        //choose
        path.add(node.val);
‌
        //check leaf
        if(node.left==null && node.right==null && target==node.val){
            result.add(new ArrayList<>(path)); //copy path
        }
        else {
            // explore
            dfs(node.left, target-node.val, path, result);
            dfs(node.right, target-node.val, path, result);
‌
        }
‌
        path.remove(path.size()-1);
    }
}
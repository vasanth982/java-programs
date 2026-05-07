import java.util.ArrayDeque;
import java.util.Queue;
 
class TreeNode {
int data;
TreeNode left, right;
 
public TreeNode(int data){
this.data = data;
this.left = this.right = null;
}
}
 
class BFSTraversal {
 
public void bfs(TreeNode root){
if(root==null)
return;
 
Queue<TreeNode> q = new ArrayDeque<>();
q.add(root);
 
while(!q.isEmpty()){
TreeNode node = q.poll();
System.out.print(node.data + " ");
 
if(node.left!=null)
q.add(node.left);
 
if(node.right!=null)
q.add(node.right);
}
}
 
public static void main(String[] args) {
TreeNode root=new TreeNode(10);
root.left=new TreeNode(20);
root.right=new TreeNode(30);
root.left.left=new TreeNode(40);
root.left.right=new TreeNode(50);
root.right.right=new TreeNode(60);
 
System.out.println("BFS Traversal");
BFSTraversal tree = new BFSTraversal();
tree.bfs(root);
}
}
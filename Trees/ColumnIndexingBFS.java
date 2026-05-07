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
 
 
// to store (node, column)
 
class Pair {
 
TreeNode node;
int col;
 
Pair( TreeNode node, int col) {
this.node = node;
this.col = col;
 
}
 
}
 
 
 
 
class ColumnIndexingBFS {
public static void bfsWithColIndx(TreeNode root){
if(root==null)
return;
 
Queue<Pair> queue = new ArrayDeque<>();
queue.add(new Pair(root,0)); // root at column 0
 
while(!queue.isEmpty()){
Pair p = queue.poll(); // remove from front
TreeNode node = p.node;
int col = p.col;
System.out.println("Node: "+node.data + " Column: "+col);
 
//left child - > column 1
 
if(node.left!=null)
queue.add(new Pair(node.left, col-1));
 
if(node.right!=null)
queue.add(new Pair(node.right, col+1));
 
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
bfsWithColIndx(root);
}
}
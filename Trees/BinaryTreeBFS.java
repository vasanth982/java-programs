import java.util.ArrayDeque;
import java.util.Queue;
class Node {
int data;
Node left, right;
public Node(int data){
this.data = data;
this.left = this.right = null;
}
}
class BinaryTreeBFS {
Node root;
void printBFS(){
if(root==null)
return;
 // ArrayDeque is faster than LinkedList for Stack/Queue operations
Queue<Node> queue = new ArrayDeque<>();
queue.add(root);
while(!queue.isEmpty()) {
Node currNode=queue.poll();
System.out.print(currNode.data + " ");
// Enqueue children (Left then Right)
if(currNode.left!=null){
queue.add(currNode.left);
}
if(currNode.right!=null){
queue.add(currNode.right);
}
}
}
public static void main(String[] args) {
BinaryTreeBFS tree = new BinaryTreeBFS();
tree.root=new Node(10);
tree.root.left=new Node(20);
tree.root.right=new Node(30);
tree.root.left.left=new Node(40);
tree.root.left.right=new Node(50);
tree.root.right.right=new Node(60);
System.out.println("BFS Traversal");
tree.printBFS();
}
}
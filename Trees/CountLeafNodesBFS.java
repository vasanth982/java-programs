import java.util.Queue;
import java.util.ArrayDeque;
class Node {
int data;
Node left, right;
public Node(int data){
this.data = data;
this.left = this.right = null;
}
}
class CountLeafNodesBFS {
Node root;
int countNodes(Node root) {
if (root == null)
return 0;
Queue<Node> queue = new ArrayDeque<>();
queue.add(root);
int count=0;
while(!queue.isEmpty()) {
Node curr = queue.poll();
if(curr.left==null && curr.right==null)
count++;
if(curr.left!=null)
queue.add(curr.left);
if(curr.right!=null)
queue.add(curr.right);
}
return count;
}
public static void main(String[] args) {
CountLeafNodesBFS tree = new CountLeafNodesBFS();
tree.root=new Node(10);
tree.root.left=new Node(20);
tree.root.right=new Node(30);
tree.root.left.left=new Node(40);
tree.root.left.right=new Node(50);
tree.root.right.right=new Node(70);
int count=tree.countNodes(tree.root);
System.out.println("Total Nodes: "+count);
}
}
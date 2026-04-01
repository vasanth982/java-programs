class Node {
int data;
Node left, right;
public Node(int data){
this.data = data;
this.left = this.right = null;
}
}
class BTCountNode {
Node root;
int countNodes(Node root) {
    if (root == null)
        return 0;
    int leftCount = countNodes(root.left);
    int rightCount = countNodes(root.right);
    return 1 + leftCount+rightCount;
}
public static void main(String[] args) {
BTCountNode tree = new BTCountNode();
tree.root=new Node(10);
tree.root.left=new Node(20);
tree.root.right=new Node(30);
tree.root.left.left=new Node(40);
tree.root.left.right=new Node(50);
tree.root.right.left=new Node(60);
tree.root.right.right=new Node(70);
int count=tree.countNodes(tree.root);
System.out.println("Total Nodes: "+count);
}
}
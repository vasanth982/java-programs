class Node {
int data;
Node left, right;
public Node(int data){
this.data = data;
this.left = this.right = null;
}
}
class BinaryTreeHeightBFS {
Node root;
int height(Node root) {
    if (root == null)
        return 0;
    int leftHeight = height(root.left);
    int rightHeight = height(root.right);
    return 1 + Math.max(leftHeight, rightHeight);
}
public static void main(String[] args) {
BinaryTreeHeightBFS tree = new BinaryTreeHeightBFS();
tree.root=new Node(10);
tree.root.left=new Node(20);
tree.root.right=new Node(30);
tree.root.left.left=new Node(40);
tree.root.left.right=new Node(50);
tree.root.right.right=new Node(60);
int h=tree.height(tree.root);
System.out.println("Tree Height: "+h);
}
}
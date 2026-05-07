import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Map;
import java.util.List;
import java.util.TreeMap;
import java.util.ArrayList;
 
class TreeNode {
int data;
TreeNode left, right;
 
TreeNode(int data){
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
 
 
 
 
class TreeMapStoreNodesColumnWiseBFS {
 
 
public static void verticalOrder(TreeNode root){
if(root==null)
return;
 
// TreeMap keeps keys sorted: column -> list of node values
TreeMap<Integer, List<Integer>> map = new TreeMap<>();
 
 
Queue<Pair> queue = new ArrayDeque<>();
queue.add(new Pair(root,0)); // root at column 0
 
while(!queue.isEmpty()){
Pair p = queue.poll(); // remove from front
TreeNode node = p.node;
int col = p.col;
 
//store node value in corresponding column
map.computeIfAbsent(col, k-> new ArrayList<>()).add(node.data);
 
//left child - > column 1
 
if(node.left!=null)
queue.add(new Pair(node.left, col-1));
 
if(node.right!=null)
queue.add(new Pair(node.right, col+1));
}
//print the map (column-wise groups)
for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
System.out.println("Column "+entry.getKey() + " -> "+ entry.getValue());
                             
}
}
 
public static void main(String[] args) {
 
TreeNode root=new TreeNode(10);
root.left=new TreeNode(20);
root.right=new TreeNode(30);
root.left.left=new TreeNode(40);
root.left.right=new TreeNode(50);
root.right.right=new TreeNode(60);
 
System.out.println("Vertical Order Traversal");
verticalOrder(root);
}
}
import java.util.PriorityQueue;

class Node {
    int val;

    Node(int val) {
        this.val = val;
    }

    public static void main(String[] args) {

        // Min Heap: smallest value stays at top
        PriorityQueue<Node> MinHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        MinHeap.add(new Node(10));
        MinHeap.add(new Node(5));

        System.out.println(MinHeap.peek().val);
    }
}
import java.util.PriorityQueue;
public class MinHeapExample{
public static void main(String[] args){
//1.inilielize min heap
PriorityQueue<Integer> MinHeap=new PriorityQueue<>();
//2.add elements
MinHeap.add(10);
MinHeap.add(5);
MinHeap.add(20);
//3.peek at smallest element
System.out.println("Smallest"+MinHeap.peek());
//4.remove the smallest element
MinHeap.poll();
System.out.println("nextSmallest"+MinHeap.peek());
}
}
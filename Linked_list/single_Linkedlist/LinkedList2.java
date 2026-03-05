class Node{
int data;
Node next;
Node(int data,Node next){
this.data = data;
this.next = next;
}
}
class LinkedList2{
public static void main(String[] args){
LinkedList2 l1 = new LinkedList2();
Node head;
head = l1.createll();
}
Node createll(){
Node n1 = new Node(500,null);
return n1;
}
}
class Node{
int data;
Node next;
Node(int data,Node next){
this.data = data;
this.next = next;
}
}
class LinkedList3{
public static void main(String[] args){
LinkedList3 l1 = new LinkedList3();
Node head;
head = l1.createll();
l1.display(head);
}
Node createll(){
Node n1 = new Node(500,null);
return n1;
}
void display(Node head){
while(head!=null){
System.out.println(head.data + "-->");
head = head.next;
}
}
}
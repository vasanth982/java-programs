class Node{
int data;
Node next;
Node(int data,Node next){
this.data = data;
this.next = next;
}
}
class LinkedList4{
public static void main(String[] args){
LinkedList4 l1 = new LinkedList4();
Node head;
head = l1.createll();
l1.display(head);
System.out.println("/n");
l1.insert(head);
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
void insert(Node head){
Node temp = new Node(500,null);
Node current = head;
while(current.next!= null){
current = current.next;
}
current.next = temp;
}
}
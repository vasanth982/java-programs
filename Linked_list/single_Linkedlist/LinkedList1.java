class Node{
int data;
Node next;
Node(int data, Node next){
this.data=data;
this.next=next;
}
}
class LinkedList1{
public static void main(String[] args){
createLL();
}
static void createLL(){
Node n1=new Node(124,null);
Node head;
head=n1;
while(head!=null){
System.out.println(head.data+"->");
head=head.next;
}
}
}
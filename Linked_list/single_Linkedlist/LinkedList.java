class Node{
int data;
Node next;
}
class LinkedList{
public static void main(String[] args){
createLL();
}
static void createLL(){
Node n1 = new Node();
Node head;
n1.data=100;
n1.next=null;
head=n1;
while(head!=null){
System.out.println(head.data + "->");
head=head.next;
}
}
}
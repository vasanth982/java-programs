import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
}

class LinkedList6{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);
LinkedList6 l1 = new LinkedList6();

Node head = null;

System.out.println("LinkedList Implementation");

int ch = 0;
int data = 0;

the_loop:while(ch!=5){

System.out.println("\n1.create 2.insert 3.delete 4.display 5.exit");
ch = scan.nextInt();

switch(ch){

case 1:
       System.out.println("Enter a value");
       data = scan.nextInt();
       head = l1.createLL(data);
       break;

case 2:
       System.out.println("Enter a value");
       data = scan.nextInt();
       l1.insert(head,data);
       break;

case 3:
       System.out.println("Enter value to delete");
       data = scan.nextInt();
       head = l1.delete(head,data);
       break;

case 4:
       l1.display(head);
       break;

case 5:
       break the_loop;

default:
       System.out.println("Invalid choice");
       break;
}
}
}

Node createLL(int data){
Node n1 = new Node(data,null);
return n1;
}

void display(Node head){

while(head!=null){

if(head.next == null){
System.out.println(head.data);
}
else{
System.out.print(head.data + "-->");
}

head = head.next;
}
}

void insert(Node head,int data){

Node temp = new Node(data,null);
Node current = head;

while(current.next!=null){
current = current.next;
}

current.next = temp;
}

Node delete(Node head,int data){

Node temp = head;
Node prev = null;

while(temp!=null && temp.data!=data){
prev = temp;
temp = temp.next;
}

if(temp==null){
System.out.println("Value not found");
return head;
}

if(prev==null){
head = temp.next;
}
else{
prev.next = temp.next;
}

return head;
}

}
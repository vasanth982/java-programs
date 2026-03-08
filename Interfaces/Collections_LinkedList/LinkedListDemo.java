import java.util.LinkedList;
class LinkedListDemo{
public static void main(String[] args){
LinkedList<Integer>list = new LinkedList<>();
list.add(10);
list.add(20);
list.add(30);
for(Integer num:list){
System.out.println(num+"");
}
}
}
import java.util.PriorityQueue;
import java.util.Comparator;
class Student{
String name;
double gpa;
public Student(String name, double gpa){
this.name=name;
this.gpa=gpa;
}
@Override
public String toString(){
return name + "(" + gpa+ " )";
}
}
public class MinHeapObjectExample{
public static void main (String [] args){
PriorityQueue <Student> gpaMinHeap = new PriorityQueue <> (Comparator.comparingDouble(s -> s.gpa));
gpaMinHeap.add(new Student("Anbu", 3.8));
gpaMinHeap.add(new Student("Aasai", 3.2));
gpaMinHeap.add(new Student("Isai",4.0));
gpaMinHeap.add(new Student("Ezhil",2.9));
System.out.println("Student with Lowest GPA (peek): " + gpaMinHeap.peek());
System.out.println("Processing students(lowest GPA first):");
while(!gpaMinHeap.isEmpty()){
System.out.println ("-" + gpaMinHeap.poll());
}
}
}
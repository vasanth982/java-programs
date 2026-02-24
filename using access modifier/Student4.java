public class Student4{
public int vtuno;
public String name;
public String dept;
public Student4(int vtuno,String name,String dept){
this.vtuno=vtuno;
this.name=name;
this.dept=dept;
}
public static void main(String[] args){
Student4 obj1 = new Student4(4,"raghu","CSE");
obj1.display();
}
public void display(){
System.out.println(this.vtuno +" "+ this.name+" "+ this.dept);
}
}
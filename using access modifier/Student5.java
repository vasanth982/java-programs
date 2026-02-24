public class Student5{
public int vtuno;
public String name;
public String dept;
Student5(){
this.vtuno=6;
this.name="Magizh";
this.dept="CSE";
}
public Student5(int vtuno,String name,String dept){
this.vtuno=vtuno;
this.name=name;
this.dept=dept;
}
public void display(){
System.out.println(this.vtuno+ this.name+ this.dept);
}
public static void main(String[] args){
Student5 obj1 = new Student5(7,"Murugan","CSE");
obj1.display();
Student5 obj2 = new Student5();
obj2.display();
}
}
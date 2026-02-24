public class Student3{
public int vtuno;
public String name;
public String dept;
public static void main(String[] args){
Student3 obj1=new Student3();
obj1.display();
}
Student3(){    //constructors
vtuno=3;
name="Surya";
dept="cse";
}
void display(){
System.out.println(vtuno+" "+name+" "+dept);
}
}
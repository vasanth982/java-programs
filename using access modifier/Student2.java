public class Student2{
public int vtuno;
public String name;
public String dept;

public static void main(String[] args){

Student2 obj1 = new Student2();
obj1.initialise();
}
void initialise(){
vtuno=25190;
name="vasanth";
dept="CSE";
System.out.println(vtuno+" "+name+" "+dept);
}
}
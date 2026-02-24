class Employee{
private int emp_id;
private String emp_name;
private String emp_doj;
Employee(){
this.emp_id = 2;
this.emp_name = "Vasanth";
this.emp_doj = "12032024";
}
Employee(int emp_id,String emp_name,String doj){
this.emp_id = emp_id;
this.emp_name = emp_name;
this.emp_doj = emp_doj;
}
void setEmp_id(int emp_id){
this.emp_id = emp_id;
}
void setEmp_name(String emp_name){
this.emp_name = emp_name;
}
void setEmp_doj(String emp_doj){
this.emp_doj = emp_doj;
}
int getEmp_id(){
return this.emp_id;
}
String getEmp_name(){
return this.emp_name;
}
String getEmp_doj(){
return this.emp_doj;
}
}
class EmployeeEx{
public static void main(String[] args){
Employee e1 = new Employee();
Employee e2 = new Employee();
Employee e3 = new Employee(2,"Sita","16042024");

System.out.println("Using getter");
System.out.println(e1.getEmp_id()+""+e2.getEmp_name()+""+e3.getEmp_doj());
e1.setEmp_id(12);
e2.setEmp_name("Ammu");
e3.setEmp_doj("16042024");
System.out.println("After using setter");
System.out.println(e1.getEmp_id()+""+e2.getEmp_name()+""+e3.getEmp_doj());
}
}
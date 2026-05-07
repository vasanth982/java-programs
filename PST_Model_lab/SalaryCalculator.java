import java.util.Scanner;
class Employee{
protected String name;
protected int employeeID;
public Employee(String name,int employeeID){
this.name=name;
this.employeeID=employeeID;
}}
class Manager extends Employee{
private double salary;
public Manager(String name,int employeeID,double salary){
super(name,employeeID);
this.salary=salary;
}
public void displayAnnualSalary(){
double annualSalary=salary*12;
System.out.println("name: "+name);
System.out.printf("Annual Salary: Rs.%.2f\n",annualSalary);
}
}
public class SalaryCalculator{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String name=sc.nextLine();
int employeeID=sc.nextInt();
double monthlySalary=sc.nextDouble();
Manager result=new Manager(name,employeeID,monthlySalary);
result.displayAnnualSalary();
sc.close();
}
}

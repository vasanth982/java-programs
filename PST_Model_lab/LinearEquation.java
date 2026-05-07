import java.util.Scanner;
class Equation{
private double a,b,c;
public Equation(double a,double b,double c){
this.a=a;
this.b=b;
this.c=c;
}
public void calculateAndPrint(){
if(a==0.0){
System.out.println("x=undefine (division by zero)");
}else{
double x=(c-b)/a;
System.out.printf("x=%.2f\n",x);
}
if(b==0.0){
System.out.println("y=undefine(division by zero)");
}else{
double y=(c-a)/b;
System.out.printf("y=%.2f\n",y);
}
}
}
public class LinearEquation{
public static void main (String[] args){
Scanner sc=new Scanner(System.in);
if(sc.hasNextDouble()&& sc.hasNextDouble()&& sc.hasNextDouble()){
double a= sc.nextDouble();
double b= sc.nextDouble();
double c= sc.nextDouble();
Equation eq=new Equation(a,b,c);
eq.calculateAndPrint();
}else{
System.out.println("invalid input");
}
sc.close();
}
}

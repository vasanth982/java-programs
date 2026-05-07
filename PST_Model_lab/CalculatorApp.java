import java.util.Scanner;
public class CalculatorApp{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String input1=sc.next();
String input2=sc.next();
try{
long num1=Long.parseLong(input1);
long num2=Long.parseLong(input2);
long sum=num1+num2;
System.out.println("The sum is :"+sum);
}catch(Exception e){
System.out.println("invalid input .pls enter valid input");
}
sc.close();
}
}
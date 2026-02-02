import java.util.Scanner;
class Numcomparison{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.print("enter num1:");
int num1=scan.nextInt();
System.out.print("enter num2:");
int num2=scan.nextInt();
System.out.print("enter num3:");
int num3=scan.nextInt();
if(num1>num2 ){
System.out.print(num1+" is greater");
};
else if(num2>num3){
System.out.print(num2+" is greater");
};
else{
System.out.print(num3+" is greater");
}
}
}
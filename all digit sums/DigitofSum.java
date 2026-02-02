import java.util.Scanner;
class DigitofSum{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.print("enter the num : ");
int num=scan.nextInt();
int sum=0;
while(num>0){
int digit=num%10;
sum=sum+digit;
num=num/10;

System.out.println("sum of the Digits:" +sum);
}
}
}

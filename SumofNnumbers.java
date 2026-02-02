import java.util.Scanner;
class SumofNnumbers{
public static  void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.print("enter the n value");
int N=scan.nextInt();
int sum=0;

for(int i=1;i<=N;i++){
sum=sum+i;

System.out.println(sum);
}
}
}
import java.util.Scanner;
class FactofNnumbers{
public static  void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.print("enter the n value");
int N=scan.nextInt();
int fact=1;

for(int i=1;i<=N;i++){
fact=fact*i;
}
System.out.println(fact);

}
}
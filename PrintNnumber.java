import java.util.Scanner;
class PrintNnumber{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("enter the N value");
int N=scan.nextInt();

System.out.println("output");

for(int i=1;i<=N;i++){
System.out.println(i);
}
}
}
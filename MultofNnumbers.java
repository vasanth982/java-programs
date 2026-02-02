import java.util.Scanner;
class MultofNnumbers{
public static  void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.print("enter the n value");
int N=scan.nextInt();
int mult=1;

for(int i=1;i<=N;i++){
mult=mult*i;
}
System.out.println(mult);

}
}
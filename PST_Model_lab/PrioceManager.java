import java.util.Scanner;
import java.util.Vector;
public class PrioceManager{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Vector<Integer>v=new Vector<>();
for (int i=0;i<n;i++){
v.add(sc.nextInt());
}
v.add(sc.nextInt());
for (int x:v){
System.out.print(x +" ");
}
sc.close();
}
}
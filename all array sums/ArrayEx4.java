import java.util.Scanner;
class ArrayEx4{
public static void main(String[] args){
createArray();
}
static void createArray(){
Scanner scan=new Scanner(System.in);
int [] arr=new int[3];
for(int i=0;i<arr.length;i++){
System.out.println("Enter value for index"+i);
arr[i]=scan.nextInt();
}
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
}
}
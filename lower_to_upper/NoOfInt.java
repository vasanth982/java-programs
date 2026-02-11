import java.util.Scanner;
class NoOfInt{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter a String:");
String str=scan.nextLine();
int count=0;
for (int i = 0; i<str.length(); i++){
if (Character.isDigit(str.charAt(i))){
count++;
}
}
System.out.println("Number of Integers:" +count);
}
}
import java.util.Scanner;
class UpperToLower{
public static void main(String[] args){
UpperToLower obj=new UpperToLower();
obj.convertToLower();
}
void convertToLower(){
Scanner scan = new Scanner(System.in);
String str = "Amma";
int i=0;
while(i<str.length()){
int asci=str.charAt(i);
asci=asci+32;
System.out.println((char)asci);
i++;
}
}
}
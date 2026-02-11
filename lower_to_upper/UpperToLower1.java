import java.util.Scanner;
class UpperToLower1{
public static void main(String[] args){
UpperToLower1 obj=new UpperToLower1();
obj.convertToLower();
}
void convertToLower(){
Scanner scan = new Scanner(System.in);
String str = "Amma";
int i=0;
while(i<str.length()){
int asci=str.charAt(i);
if(asci>=65&&asci<=90){
asci=asci+32;
}
System.out.println((char)asci);
i++;
}
}
}
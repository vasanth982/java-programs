import java.util.Scanner;
class UpperToLower2{
public static void main(String[] args){
UpperToLower2 obj=new UpperToLower2();
obj.convertToLower();
}
void convertToLower(){
Scanner scan = new Scanner(System.in);
String str = "VASANTH";
String temp= " ";
int i=0;
while(i<str.length()){
int asci=str.charAt(i);
if(asci>=65&&asci<=90){
int t = asci+32;
char ch = (char)t;
System.out.println(ch);
}
else{
System.out.println(str.charAt(i));
}
i++;
}
}
}
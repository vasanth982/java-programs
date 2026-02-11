import java.util.Scanner;
class LowerToUpper{
public static void main(String[] args){
LowerToUpper obj=new LowerToUpper();
obj.convertToUpper();
}
void convertToUpper(){
Scanner scan = new Scanner(System.in);
String str = "Amma";
int i=0;
while(i<str.length()){
int asci=str.charAt(i);
asci=asci-32;
System.out.println((char)asci);
i++;
}
}
}
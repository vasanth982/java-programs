
class LowerToUpper1{
public static void main(String[] args){

String str = "Amma";
String temp = "";
int i=0;
while(i<str.length()){
int asci=str.charAt(i);
if(asci>=97&&asci<=123){
asci=asci-32;
}
System.out.println((char)asci);
i++;
}
}
}